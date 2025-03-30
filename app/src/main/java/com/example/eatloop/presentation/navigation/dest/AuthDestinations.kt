package com.example.eatloop.presentation.navigation.dest

import kotlinx.serialization.Serializable

@Serializable
sealed interface AuthDestinations {
    data object Login : AuthDestinations
    data object Signup : AuthDestinations
    data object Reset : AuthDestinations
    data object Otp : AuthDestinations
    data object NewPass: AuthDestinations
}