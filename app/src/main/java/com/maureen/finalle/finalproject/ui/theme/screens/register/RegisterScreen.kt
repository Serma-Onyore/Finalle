package com.example.myapplication.ui.theme.screens.register

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
import com.example.finalproject.navigation.ROUTE_LOGIN

//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.myapplication.navigation.ROUTE_HOME
//import com.example.myapplication.navigation.ROUTE_LOGIN

@Composable
fun RegisterScreen(navController: NavController){
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
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold)
        Text(text = "Register here",
            color = Color.Black,
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold)
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Name") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Telephone Number") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Email") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = {Text(text = "Enter your Location") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Enter your Password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Spacer(modifier = Modifier.height(7.dp))
        OutlinedTextField(value = "",
            onValueChange ={},
            label = { Text(text = "Confirm your Password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(7.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }
        Button(onClick = { navController.navigate(ROUTE_LOGIN)  }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "You have an account? Log In")
        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RegisterScreenPreview(){
//    RegisterScreen(navController = rememberNavController())
}