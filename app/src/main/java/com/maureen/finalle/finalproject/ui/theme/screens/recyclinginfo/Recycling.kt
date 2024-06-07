package com.example.myapplication.ui.theme.screens.recyclinginfo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.finalproject.navigation.ROUTE_CURBSIDE
import com.example.finalproject.navigation.ROUTE_DROPOFF
import com.example.finalproject.navigation.ROUTE_RECYCLINGPROCESS

@Composable
fun Recycling(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .background(Color.Magenta)) {
            Text(text = "TYPES OF WASTE RECYCLING",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold)
        Button(onClick = { navController.navigate(ROUTE_CURBSIDE) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Curb-side Recycling",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { ROUTE_DROPOFF },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Drop-off Recycling",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_RECYCLINGPROCESS) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Recycling Process",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RecyclingReview(){
Recycling(navController = rememberNavController())
}