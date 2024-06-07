package com.example.finalproject.ui.theme.screens.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.finalproject.R
import com.example.finalproject.navigation.ROUTE_BINLOCATION
import com.example.finalproject.navigation.ROUTE_RECYCLING
import com.example.finalproject.navigation.ROUTE_RECYCLINGINFO
import com.example.finalproject.navigation.ROUTE_WASTEREDTIPS
//import androidx.wear.compose.material.Icon
//import com.example.myapplication.R
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ViewScreen(navController: NavController){
    Scaffold {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth())
            {
                item {
                    Row (
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp)
                            .fillMaxWidth()
                    ){
                        var searchText by remember { mutableStateOf("") }
                        TextField(value = searchText,
                            onValueChange = {searchText = it},
                            modifier = Modifier
                                .clickable {}
                                .fillMaxWidth()
                                .background(Color.Transparent)
                                .padding(start = 10.dp, end = 10.dp),
                            placeholder = { Text(text = "Search....")},
                            leadingIcon = {
//                                Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
//                                androidx.compose.material.icons.Icons(
//                                    imageVector = Icons.Default.Search,
//                                    contentDescription = "Search Icon",
//                                    tint = Color.Black
//                                )
                            },
                            shape = RoundedCornerShape(20.dp),
                            colors = TextFieldDefaults.textFieldColors(  ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                imeAction = ImeAction.Done,
                                keyboardType = KeyboardType.Text
                            ),
                            keyboardActions = KeyboardActions(
                                onDone = {}
                            ),
                            singleLine = true,
                            textStyle = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Card (modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color.Red)){
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(16.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.bin) ,
                                contentDescription ="",
                                modifier = Modifier.size(50.dp))
                            Spacer(modifier = Modifier.height(13.dp))
                            Column {
                                Text(text = "Bins",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp))
                                Text(text = "Location",
                                    modifier = Modifier.padding(8.dp))
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "18 bins",
                                modifier = Modifier
                                    .padding(start = 80.dp, end = 2.dp))
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            drawLine(
                                color = Color.Blue,
                                start = Offset(0f,size.height / 1),
                                end = Offset(size.width, size.height / 1),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 2.dp)){
                            Image(painter = painterResource(id = R.drawable.profilepic),
                                contentDescription = "",
                                modifier = Modifier
                                    .offset(x = (25).dp)
                                    .size(48.dp))
                            Image(painter = painterResource(id = R.drawable.tick) ,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(45.dp))
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Perfect",
                                fontWeight = FontWeight.Bold,
                                color = Color.Magenta,
                                modifier = Modifier.padding(top = 10.dp))
                            Button(onClick = { navController.navigate(ROUTE_BINLOCATION) },
                                modifier = Modifier
                                    .width(280.dp)
                                    .height(47.dp)
                                    .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Text(text = "VIEW")
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

//                    Card two
                    Card (modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color.Red)){
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(16.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.bos1) ,
                                contentDescription ="",
                                modifier = Modifier.size(50.dp))
                            Spacer(modifier = Modifier.height(13.dp))
                            Column {
                                Text(text = "Waste Reduction",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp))
                                Text(text = "Tips",
                                    modifier = Modifier.padding(8.dp))
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "7 tips",
                                modifier = Modifier
                                    .padding(start = 50.dp, end = 2.dp))
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            drawLine(
                                color = Color.Blue,
                                start = Offset(0f,size.height / 1),
                                end = Offset(size.width, size.height / 1),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 2.dp)){
                            Image(painter = painterResource(id = R.drawable.profilepic),
                                contentDescription = "",
                                modifier = Modifier
                                    .offset(x = (25).dp)
                                    .size(48.dp))
                            Image(painter = painterResource(id = R.drawable.tick) ,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(45.dp))
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Perfect",
                                fontWeight = FontWeight.Bold,
                                color = Color.Magenta,
                                modifier = Modifier.padding(top = 10.dp))
                            Button(onClick = { navController.navigate(ROUTE_WASTEREDTIPS) },
                                modifier = Modifier
                                    .width(280.dp)
                                    .height(47.dp)
                                    .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Text(text = "VIEW")
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

//                    Card3
                    Card (modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color.Red)){
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(16.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.bosi) ,
                                contentDescription ="",
                                modifier = Modifier.size(50.dp))
                            Spacer(modifier = Modifier.height(13.dp))
                            Column {
                                Text(text = "Recycling",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp))
                                Text(text = "Information",
                                    modifier = Modifier.padding(8.dp))
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "10 tips",
                                modifier = Modifier
                                    .padding(start = 80.dp, end = 2.dp))
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            drawLine(
                                color = Color.Blue,
                                start = Offset(0f,size.height / 1),
                                end = Offset(size.width, size.height / 1),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 2.dp)){
                            Image(painter = painterResource(id = R.drawable.profilepic),
                                contentDescription = "",
                                modifier = Modifier
                                    .offset(x = (25).dp)
                                    .size(48.dp))
                            Image(painter = painterResource(id = R.drawable.tick) ,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(45.dp))
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Perfect",
                                fontWeight = FontWeight.Bold,
                                color = Color.Magenta,
                                modifier = Modifier.padding(top = 10.dp))
                            Button(onClick = { navController.navigate(ROUTE_RECYCLINGINFO) },
                                modifier = Modifier
                                    .width(280.dp)
                                    .height(47.dp)
                                    .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Text(text = "VIEW")
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    Card (modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color.Red)){
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(16.dp)
                        ){
                            Image(painter = painterResource(id = R.drawable.boss) ,
                                contentDescription ="",
                                modifier = Modifier.size(50.dp))
                            Spacer(modifier = Modifier.height(13.dp))
                            Column {
                                Text(text = "Recycling",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp))
                                Text(text = "Process",
                                    modifier = Modifier.padding(8.dp))
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "5 tips",
                                modifier = Modifier
                                    .padding(start = 80.dp, end = 2.dp))
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            drawLine(
                                color = Color.Blue,
                                start = Offset(0f,size.height / 1),
                                end = Offset(size.width, size.height / 1),
                                strokeWidth = 1.dp.toPx()
                            )
                        }
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 2.dp)){
                            Image(painter = painterResource(id = R.drawable.profilepic),
                                contentDescription = "",
                                modifier = Modifier
                                    .offset(x = (25).dp)
                                    .size(48.dp))
                            Image(painter = painterResource(id = R.drawable.profilepic) ,
                                contentDescription ="",
                                modifier = Modifier
                                    .size(45.dp))
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "Perfect",
                                fontWeight = FontWeight.Bold,
                                color = Color.Magenta,
                                modifier = Modifier.padding(top = 10.dp))
                            Button(onClick = { navController.navigate(ROUTE_RECYCLING) },
                                modifier = Modifier
                                    .width(280.dp)
                                    .height(47.dp)
                                    .padding(start = 60.dp, top = 5.dp, bottom = 5.dp),
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                shape = RoundedCornerShape(16.dp)
                            ) {
                                Text(text = "VIEW")
                            }
                        }
                    }

                }
            }
        }
    }
}