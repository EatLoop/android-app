package com.example.eatloop.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.eatloop.R
import kotlinx.coroutines.delay


//class SplashScreen : ComponentActivity() {
//    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            EatloopTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) {
////                    Navigation()
//                }
//            }
//        }
//    }
//}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Splash(navController: NavController) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "EatLoop",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff333333),
            modifier = Modifier.padding(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.eatloop_logo),
            contentDescription = "Logo",
            modifier = Modifier.padding(10.dp).size(200.dp)
        )

        LaunchedEffect(key1 = true) {
            delay(3000) // Delay for 3 seconds
            navController.navigate("main") {
                popUpTo("splash") { inclusive = true } // Prevents going back to splash screen
            }
        }
    }


}