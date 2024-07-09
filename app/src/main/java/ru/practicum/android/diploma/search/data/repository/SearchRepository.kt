package ru.practicum.android.diploma.search.data.repository

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.network.dto.linkedClasses.Area
import ru.practicum.android.diploma.network.dto.linkedClasses.Country
import ru.practicum.android.diploma.network.dto.linkedClasses.Industry
import ru.practicum.android.diploma.network.dto.linkedClasses.Locale
import ru.practicum.android.diploma.network.dto.linkedClasses.VacancyFunctionalityTitle
import ru.practicum.android.diploma.network.dto.responses.DictionariesResponse
import ru.practicum.android.diploma.network.dto.responses.VacancyByIdResponse
import ru.practicum.android.diploma.network.dto.responses.VacancyListResponse
import ru.practicum.android.diploma.utils.Resource

interface SearchRepository {
    suspend fun getLocales(): Flow<Resource<List<Locale>>>
    suspend fun getDictionaries(): Flow<Resource<DictionariesResponse>>
    suspend fun getIndustries(): Flow<Resource<List<Industry>>>
    suspend fun getAreas(): Flow<Resource<List<Area>>>
    suspend fun getCountries(): Flow<Resource<List<Country>>>
    suspend fun getVacancySuggestions(textForSuggestions: String): Flow<Resource<List<VacancyFunctionalityTitle>>>
    suspend fun searchVacancy(textForSearch: String): Flow<Resource<VacancyListResponse>>
    suspend fun getVacancyById(id: String): Flow<Resource<VacancyByIdResponse>>
}
