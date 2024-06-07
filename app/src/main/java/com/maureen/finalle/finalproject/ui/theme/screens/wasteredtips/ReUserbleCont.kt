package com.example.myapplication.ui.theme.screens.wasteredtips

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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

@Composable
fun ReUserbleCont(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Magenta)
    ){
        Text(text = "USE OF REUSABLE CONTAINERS",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Box (modifier = Modifier.fillMaxSize()){
            Text(text = "Use reusable containers for food storage, instead of single-use plastic " +
                    "bags or wraps. Stainless steel containers, glass jars, and silicone bags are " +
                    "durable and eco-friendly options.",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ReUserbleContReview(){
    ReUserbleCont(navController = rememberNavController())
}