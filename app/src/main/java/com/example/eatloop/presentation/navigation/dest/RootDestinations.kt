package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface RootDestinations {
    @Serializable
    data object OnBoarding : RootDestinations

    @Serializable
    data object AuthGraph : RootDestinations

    @Serializable
    data object HomeGraph : RootDestinations
}