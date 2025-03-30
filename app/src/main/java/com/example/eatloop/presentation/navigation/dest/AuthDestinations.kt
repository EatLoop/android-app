package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface AuthDestinations {
    @Serializable
    data object Login : AuthDestinations

    @Serializable
    data object Signup : AuthDestinations

    @Serializable
    data object Reset : AuthDestinations

    @Serializable
    data object Otp : AuthDestinations

    @Serializable
    data object NewPass : AuthDestinations
}