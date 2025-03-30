package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface RootDestinations {
    data object OnBoarding : RootDestinations
    data object AuthGraph  : RootDestinations
    data object HomeGraph : RootDestinations
}