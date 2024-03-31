package com.codesharkstudio.mydotainfo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import coil.ImageLoader
import coil.memory.MemoryCache
import com.codesharkstudio.mydotainfo.R
import com.codesharkstudio.mydotainfo.ui.theme.DotaInfoTheme
import com.codesharkstudio.ui_herolist.ui.HeroList
import com.codesharkstudio.ui_herolist.ui.HeroListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        imageLoader = ImageLoader.Builder(this)
            .error(R.drawable.error_image)
            .placeholder(R.drawable.white_background)
            .memoryCache { MemoryCache.Builder(this).maxSizePercent(0.25).build() }
            .crossfade(true)
            .build()

        setContent {
            DotaInfoTheme {
                val viewModel: HeroListViewModel = hiltViewModel()
                HeroList(
                    state = viewModel.state.value,
                    imageLoader = imageLoader,
                )
            }
        }
    }
}

