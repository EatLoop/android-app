package com.example.eatloop.presentation.navigation.graph


import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.eatloop.presentation.navigation.dest.HomeDestinations


fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    composable<HomeDestinations.Menu> {
        // Menu screen composable
    }

    composable<HomeDestinations.Detail> {
        // Detail screen composable
    }

    composable<HomeDestinations.Cart> {
        // Cart Screen composable
    }

    composable<HomeDestinations.Account> {
        // Account screen composable
    }
}