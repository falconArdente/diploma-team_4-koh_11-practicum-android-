package ru.practicum.android.diploma.details.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.db.domain.api.VacancyRepository
import ru.practicum.android.diploma.details.domain.api.DatabaseInteractor
import ru.practicum.android.diploma.details.domain.model.VacancyDetails

class DatabaseInteractorImpl(private val vacancyRepository: VacancyRepository) : DatabaseInteractor {
    override suspend fun deleteVacancy(vacancyId: Int) {
        vacancyRepository.deleteVacancy(vacancyId)
    }

    override suspend fun insertVacancy(vacancyDetails: VacancyDetails) {
        vacancyRepository.insertVacancy(vacancyDetails)
    }

    override suspend fun insertVacancyWitCheck(vacancyDetails: VacancyDetails) {
        vacancyRepository.insertVacancyWitCheck(vacancyDetails)
    }

    override fun isExistsVacancy(vacancyId: Int): Flow<Boolean> {
        return vacancyRepository.isExistsVacancy(vacancyId)
    }

    override fun getVacancyById(vacancyId: Int): Flow<VacancyDetails?> {
        return vacancyRepository.getVacancyById(vacancyId)
    }
}
