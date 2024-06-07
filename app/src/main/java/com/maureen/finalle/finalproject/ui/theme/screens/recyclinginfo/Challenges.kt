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
fun Challenges(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Magenta)
    ){
        Text(text = "CHALLENGES IN RECYCLING WASTE",
            color = Color.Cyan,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Box (modifier = Modifier.fillMaxSize()){
            Text(text = "While recycling offers numerous benefits, it also faces several challenges, including:\n" +
                    "\n" +
                    "1.Contamination: Contamination of recyclable materials with non-recyclables can decrease the quality and value of the recyclables, making them harder to process and recycle effectively.\n" +
                    "2.Lack of Infrastructure: In some areas, there may be insufficient recycling facilities or collection programs, limiting the ability to recycle certain materials.\n" +
                    "3.Complexity of Sorting: Some materials, such as mixed plastics or composite materials, are challenging to sort and process efficiently, increasing the cost and difficulty of recycling them.\n" +
                    "4.Market Demand: The demand for recycled materials can fluctuate, affecting the economic viability of recycling programs and leading to stockpiling or disposal of recyclables in some cases.\n" +
                    "5.Consumer Behavior: Lack of awareness or motivation to recycle properly among consumers can lead to contamination and reduce the effectiveness of recycling efforts.\n" +
                    "Addressing these challenges requires coordinated efforts from governments, businesses, communities, and individuals to improve recycling infrastructure, educate the public, and promote sustainable consumption and waste management practices.",
                color = Color.Black,
                fontSize = 16.sp,
                fontFamily = FontFamily.SansSerif)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChallengesReview(){
    Challenges(navController = rememberNavController())
}