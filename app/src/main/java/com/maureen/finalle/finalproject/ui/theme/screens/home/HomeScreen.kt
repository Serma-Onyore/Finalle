package com.example.finalproject.ui.theme.screens.home

import androidx.compose.runtime.Composable
//import androidx.navigation.NavController
import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.finalproject.R
import com.example.finalproject.navigation.ROUTE_SCHEDULE
import com.example.finalproject.navigation.ROUTE_VIEW
import com.example.finalproject.ui.theme.screens.footer.Footer
import com.maureen.finalle.R

//import com.example.myapplication.R
//import com.example.myapplication.navigation.ROUTE_SCHEDULE
//import com.example.myapplication.navigation.ROUTE_VIEW

@Composable
fun HomeScreen(navController: NavController) {
    Footer()
    LazyColumn(
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .padding(start = 50.dp, top = 10.dp, end = 50.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Waste Management",
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default
                    )
                }
//                Row(
//                    modifier = Modifier
//                        .padding(50.dp),
//                    horizontalArrangement = Arrangement.Center
//                ) {
//                    Text(
//                        text = "Management",
//                        fontSize = 30.sp,
//                        fontFamily = FontFamily.Default
//                    )
//                }
                Row(
                    modifier = Modifier
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Where environment is a priority",
                        style = TextStyle(Color.Yellow),
                        fontFamily = FontFamily.Default
                    )

                }
                Image(
                    painter = painterResource(id = R.drawable.enviii),
                    contentDescription = "",
                    modifier = Modifier
                        .width(400.dp)
                        .height(400.dp),
                    contentScale = ContentScale.Crop
                )
                Row(
                    modifier = Modifier.padding(start = 50.dp)
                ) {
                    Text(text = "Would you like to be part of us?")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.padding(50.dp)) {
                    Button(
                        onClick = { navController.navigate(ROUTE_SCHEDULE) },
                        colors = ButtonDefaults.buttonColors(Color.Green)
                    ) {
                        Text(text = "Schedule Activity")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        onClick = { navController.navigate(ROUTE_VIEW) },
                        colors = ButtonDefaults.buttonColors(Color.Green)
                    ) {
                        Text(text = "View")
                    }
                }
            }
    }
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
//    HomeScreen(navController = rememberNavController())
}