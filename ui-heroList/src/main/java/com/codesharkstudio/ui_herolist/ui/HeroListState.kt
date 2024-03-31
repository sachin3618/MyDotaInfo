package com.codesharkstudio.ui_herolist.ui

import com.codesharkstudio.core.domain.ProgressBarState
import com.codesharkstudio.domain.Hero

data class HeroListState(
    val progressBarState: ProgressBarState = ProgressBarState.Idle,
    val heros: List<Hero> = listOf(),
)