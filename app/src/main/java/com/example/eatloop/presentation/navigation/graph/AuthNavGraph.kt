package com.example.eatloop.presentation.navigation.graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.eatloop.presentation.navigation.dest.AuthDestinations


fun NavGraphBuilder.authNavGraph(navController: NavController) {
    composable<AuthDestinations.Login> {
        // Login screen composable
    }

    composable<AuthDestinations.Signup> {
        // Signup screen composable
    }

    composable<AuthDestinations.Reset> {
        // Reset password screen composable
    }

    composable<AuthDestinations.Otp> {
        // OTP verification screen composable
    }

    composable<AuthDestinations.NewPass> {
        // Set new password screen composable
    }
}