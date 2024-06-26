package com.codesharkstudio.core.domain

sealed class UIComponent{

    data class Dialog(
        val title: String,
        val description: String,
    ): UIComponent()

    data class None(
        val message: String,
    ): UIComponent()
}