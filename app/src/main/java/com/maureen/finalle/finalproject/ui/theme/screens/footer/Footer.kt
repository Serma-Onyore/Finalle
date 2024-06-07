package com.example.finalproject.ui.theme.screens.footer

import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Footer(){
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text(text = "SmartSort") },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "You have clicked a home Icon",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home Icon")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Cyan,
            navigationIconContentColor = Color.Yellow
        ),
        actions = {
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "You have clicked a share button",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "Share",
                    tint = Color.DarkGray
                )

            }
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "You have clicked a Email button",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email",
                    tint = Color.DarkGray
                )

            }
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "You have clicked a Search button",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.DarkGray
                )

            }
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "You have clicked a menu button",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "menu",
                    tint = Color.DarkGray
                )

            }
        }
    )
}