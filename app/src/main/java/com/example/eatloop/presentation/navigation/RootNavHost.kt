package com.example.eatloop.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.eatloop.presentation.navigation.dest.AuthDestinations
import com.example.eatloop.presentation.navigation.dest.HomeDestinations
import com.example.eatloop.presentation.navigation.dest.RootDestinations
import com.example.eatloop.presentation.navigation.graph.authNavGraph
import com.example.eatloop.presentation.navigation.graph.homeNavGraph


@Composable
fun RootNavHost(
    modifier: Modifier = Modifier,
    startDestination: RootDestinations
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        navigation<RootDestinations.AuthGraph>(startDestination = AuthDestinations.Login) {
            authNavGraph(navController)
        }

        navigation<RootDestinations.HomeGraph>(startDestination = HomeDestinations.Menu) {
            homeNavGraph(navController)
        }

        composable<RootDestinations.OnBoarding> {
            // OnBoarding screen composable
        }

    }
}