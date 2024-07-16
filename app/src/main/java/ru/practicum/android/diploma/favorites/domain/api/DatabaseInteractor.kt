package ru.practicum.android.diploma.favorites.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.details.domain.model.VacancyDetails

interface DatabaseInteractor {
    fun isExistsVacancy(vacancyId: Int): Flow<Boolean>

    fun getAllVacancy(): Flow<List<VacancyDetails>>

    fun getAllVacancyByPage(pageNum: Int): Flow<List<VacancyDetails>>

    suspend fun insertVacancy(vacancyDetails: VacancyDetails)

    suspend fun deleteVacancy(vacancyId: Int)

    suspend fun insertVacancyWitCheck(vacancyDetails: VacancyDetails)
}
