package com.example.eatloop

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.eatloop.presentation.navigation.RootNavHost
import com.example.eatloop.presentation.navigation.dest.RootDestinations
import com.example.eatloop.presentation.theme.EatloopTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EatloopTheme {
                RootNavHost(startDestination = RootDestinations.HomeGraph)
            }
        }
    }
}