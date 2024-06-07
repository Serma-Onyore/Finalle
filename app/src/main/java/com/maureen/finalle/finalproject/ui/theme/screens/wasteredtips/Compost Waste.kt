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
fun CompostWaste(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Magenta)
    ){
        Text(text = "COMPOST WASTE",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Box (modifier = Modifier.fillMaxSize()){
            Text(text = "Compost food scraps, coffee grounds, yard waste, and other organic materials" +
                    " to create nutrient-rich compost for your garden. Composting reduces methane " +
                    "emissions from landfills and enriches soil health.\n" +
                    "Invest in Quality Products: Choose durable, high-quality products that are built" +
                    " to last, even if they come with a higher upfront cost. Investing in well-made " +
                    "items reduces the need for frequent replacements and minimizes waste over time.",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CompostWasteReview(){
CompostWaste(navController = rememberNavController())
}