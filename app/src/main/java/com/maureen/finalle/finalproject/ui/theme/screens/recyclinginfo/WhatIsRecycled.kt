package com.example.myapplication.ui.theme.screens.recyclinginfo

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
fun WhatRecycled(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .background(Color.Magenta)){
        Text(text = "WHAT IS RECYCLED? ",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Box (modifier = Modifier.fillMaxSize()){
            Text(text = "Many materials can be recycled, including paper, cardboard, glass," +
                    " metal (such as aluminum and steel), certain plastics, and some types of" +
                    " electronic waste (e-waste). However, it's important to check with your local" +
                    " recycling program or facility for specific guidelines on what can and cannot be" +
                    " recycled in your area.",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WhatRecycledReview(){
WhatRecycled(navController = rememberNavController())
}