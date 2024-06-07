package com.example.myapplication.ui.theme.screens.wasteredtips

import androidx.compose.foundation.layout.Arrangement
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
import com.example.finalproject.navigation.ROUTE_CLOTHSWAP
import com.example.finalproject.navigation.ROUTE_COMPOSTWASTE
import com.example.finalproject.navigation.ROUTE_JUNKMAIL
import com.example.finalproject.navigation.ROUTE_REPAIR
import com.example.finalproject.navigation.ROUTE_REUSERBLECONT
import com.example.finalproject.navigation.ROUTE_SECONGHAND
import com.example.finalproject.navigation.ROUTE_ZEROWASTE

@Composable
fun WasteRedTips(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "WASTE REDUCTION TIPS",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold)
        Button(onClick = { navController.navigate(ROUTE_REUSERBLECONT) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Re-Usable Containers",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_SECONGHAND) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Second hand shopping",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_JUNKMAIL) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Junk Mail",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_COMPOSTWASTE) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Compost Waste",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_REPAIR) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Repair",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_CLOTHSWAP) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Clothing Swap",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
        Button(onClick = { navController.navigate(ROUTE_ZEROWASTE) },
            colors = ButtonDefaults.buttonColors(Color.Black)) {
            Text(text = "Zero-Waste lifestyle",
                color = Color.Green,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WasteRedReview(){
WasteRedTips(navController = rememberNavController())
}