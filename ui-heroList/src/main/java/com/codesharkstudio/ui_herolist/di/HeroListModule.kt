package com.codesharkstudio.ui_herolist.di

import com.codesharkstudio.hero_interactors.GetHeros
import com.codesharkstudio.hero_interactors.HeroInteractors
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HeroListModule {

    /**
     * @param interactors is provided in app module.
     */
    @Provides
    @Singleton
    fun provideGetHeros(
        interactors: HeroInteractors
    ): GetHeros {
        return interactors.getHeros
    }
}