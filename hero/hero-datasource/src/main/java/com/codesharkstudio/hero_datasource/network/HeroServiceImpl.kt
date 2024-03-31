package com.codesharkstudio.hero_datasource.network

import com.codesharkstudio.domain.Hero
import com.codesharkstudio.hero_datasource.network.model.HeroDto
import com.codesharkstudio.hero_datasource.network.model.toHero
import io.ktor.client.*
import io.ktor.client.request.*

class HeroServiceImpl(
    private val httpClient: HttpClient,
): HeroService {

    override suspend fun getHeroStats(): List<Hero> {
        return httpClient.get<List<HeroDto>> {
            url(EndPoints.HERO_STATS)
        }.map { it.toHero() }
    }
}