package com.example.myapplication.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.finalproject.navigation.ROUTE_HOME
import com.example.finalproject.navigation.ROUTE_REGISTER

//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.myapplication.navigation.ROUTE_HOME
//import com.example.myapplication.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "HELLO & WELCOME",
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold)
        Text(text = "USER LOG IN",
            color = Color.Black,
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Email")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Password")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(ROUTE_HOME) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Log In")
        }
        Button(onClick = { navController.navigate(ROUTE_REGISTER) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "You do not have an account? Register")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){
//    LoginScreen(navController = rememberNavController())
}
