package com.codesharkstudio.ui_herolist.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil.ImageLoader
import com.codesharkstudio.core.domain.ProgressBarState
import com.codesharkstudio.ui_herolist.components.HeroListItem


@Composable
fun HeroList(
    state: HeroListState,
    imageLoader: ImageLoader,
){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ){
            items(state.heros){ hero ->
                HeroListItem(
                    hero = hero,
                    onSelectHero = {},
                    imageLoader = imageLoader,
                )
            }
        }
        if(state.progressBarState is ProgressBarState.Loading){
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}


