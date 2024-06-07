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
fun Benefits(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Magenta)
    ){
        Text(text = "BENEFITS OF RECYCLING WASTE",
            color = Color.Cyan,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Box (modifier = Modifier.fillMaxSize()){
            Text(text = "Recycling waste offers several benefits, such as:\n" +
                    "\n" +
                    "1.Conservation of Resources: Recycling reduces the need for raw materials, conserving natural resources like forests, minerals, and water.\n" +
                    "2.Energy Savings: Recycling often requires less energy than producing new items from raw materials, leading to lower energy consumption and reduced greenhouse gas emissions.\n" +
                    "3.Waste Reduction: Recycling helps divert waste from landfills, reducing the burden on landfill space and decreasing pollution.\n" +
                    "4.Economic Benefits: Recycling creates jobs in collection, processing, and manufacturing industries, contributing to local economies.\n" +
                    "5.Conservation of Habitat: By reducing the demand for new materials, recycling helps preserve habitats and ecosystems that would otherwise be disrupted by extraction and processing.\n" +
                    "Overall, recycling plays a crucial role in promoting sustainability, conserving resources, and mitigating environmental impacts.",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BenefitsPreview(){
    Benefits(navController = rememberNavController())
}