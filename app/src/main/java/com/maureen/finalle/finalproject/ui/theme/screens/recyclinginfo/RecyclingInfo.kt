package com.example.myapplication.ui.theme.screens.recyclinginfo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject.navigation.ROUTE_BENEFITS
import com.example.finalproject.navigation.ROUTE_CHALLENGES
import com.example.finalproject.navigation.ROUTE_EWASTE
import com.example.finalproject.navigation.ROUTE_PREPARATION
import com.example.finalproject.navigation.ROUTE_RECYCLING
import com.example.finalproject.navigation.ROUTE_WHATISRECYCLED


@Composable
fun Recyclinginfo (navController: NavController){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ){
        Column (
            modifier = Modifier
                .matchParentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "RECYCLING INFORMATION",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold)
            Button(onClick = {navController.navigate(ROUTE_WHATISRECYCLED) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "What can be Recycled?",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
            }
            Button(onClick = { navController.navigate(ROUTE_PREPARATION) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "Preparation",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp)
            }
            Button(onClick = { navController.navigate(ROUTE_RECYCLING) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "Recycling",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp)
            }
            Button(onClick = { navController.navigate(ROUTE_BENEFITS) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "Benefits of Recycling",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp)
            }
            Button(onClick = { navController.navigate(ROUTE_CHALLENGES) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "Recycling Challenges",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp)
            }
            Button(onClick = { navController.navigate(ROUTE_EWASTE) },
                colors = ButtonDefaults.buttonColors(Color.Black)) {
                Text(text = "E waste Recycling",
                    color = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp)
            }
//            Button(onClick = {  },
//                colors = ButtonDefaults.buttonColors(Color.Black)) {
//                androidx.wear.compose.material.Text(text = "Reduce and Reuse",
//                    color = Color.Green,
//                    fontFamily = FontFamily.SansSerif,
//                    fontWeight = FontWeight.ExtraBold,
//                    fontSize = 20.sp)
//            }
        }
    }
}
@Preview
@Composable
fun RecyclingInfoPreview (){
    Recyclinginfo(navController = rememberNavController())
}