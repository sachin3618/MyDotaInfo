package com.codesharkstudio.hero_interactors

import com.codesharkstudio.core.domain.DataState
import com.codesharkstudio.core.domain.ProgressBarState
import com.codesharkstudio.core.domain.UIComponent
import com.codesharkstudio.domain.Hero
import com.codesharkstudio.hero_datasource.cache.HeroCache
import com.codesharkstudio.hero_datasource.network.HeroService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class GetHeros(
    private val cache: HeroCache,
    private val service: HeroService,
) {

    fun execute(): Flow<DataState<List<Hero>>> = flow {
        try {
            emit(DataState.Loading(progressBarState = ProgressBarState.Loading))

            val heros: List<Hero> = try { // catch network exceptions
                service.getHeroStats()
            }catch (e: Exception){
                System.out.println("HeroException " + e.message.toString())

                e.printStackTrace() // log to crashlytics?
                emit(DataState.Response<List<Hero>>(
                    uiComponent = UIComponent.Dialog(
                        title = "Network Data Error",
                        description = e.message?: "Unknown error"
                    )
                ))
                listOf()
            }

            // cache the network data
            cache.insert(heros)

            // emit data from cache
            val cachedHeros = cache.selectAll()

            emit(DataState.Data(cachedHeros))
        }catch (e: Exception){
            e.printStackTrace()
            emit(DataState.Response<List<Hero>>(
                uiComponent = UIComponent.Dialog(
                    title = "Error",
                    description = e.message?: "Unknown error"
                )
            ))
        }
        finally {
            emit(DataState.Loading(progressBarState = ProgressBarState.Idle))
        }
    }
}
