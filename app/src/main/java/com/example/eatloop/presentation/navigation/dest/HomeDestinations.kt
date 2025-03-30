package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface HomeDestinations {
    data object Account : HomeDestinations
    data object Menu : HomeDestinations
    data object Detail : HomeDestinations
    data object Cart : HomeDestinations
}