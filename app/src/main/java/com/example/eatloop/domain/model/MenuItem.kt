package com.example.eatloop.domain.model

data class MenuItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val imgUrl: String,
    val isFavorite: Boolean = false
)