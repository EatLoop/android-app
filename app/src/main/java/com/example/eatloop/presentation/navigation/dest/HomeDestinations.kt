package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface HomeDestinations {
    @Serializable
    data object Account : HomeDestinations

    @Serializable
    data object Menu : HomeDestinations

    @Serializable
    data object Detail : HomeDestinations

    @Serializable
    data object Cart : HomeDestinations
}