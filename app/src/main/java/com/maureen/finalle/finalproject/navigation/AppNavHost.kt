package com.example.finalproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.finalproject.ui.theme.screens.about.About
import com.example.finalproject.ui.theme.screens.binlocation.BinLocation
import com.example.finalproject.ui.theme.screens.home.HomeScreen
import com.example.finalproject.ui.theme.screens.schedule.Schedule
import com.example.finalproject.ui.theme.screens.view.ViewScreen
import com.example.myapplication.ui.theme.screens.login.LoginScreen
import com.example.myapplication.ui.theme.screens.recyclinginfo.Benefits
import com.example.myapplication.ui.theme.screens.recyclinginfo.Challenges
import com.example.myapplication.ui.theme.screens.recyclinginfo.Curbside
import com.example.myapplication.ui.theme.screens.recyclinginfo.DropOff
import com.example.myapplication.ui.theme.screens.recyclinginfo.Ewaste
import com.example.myapplication.ui.theme.screens.recyclinginfo.Preparation
import com.example.myapplication.ui.theme.screens.recyclinginfo.Recycling
import com.example.myapplication.ui.theme.screens.recyclinginfo.RecyclingProcess
import com.example.myapplication.ui.theme.screens.recyclinginfo.Recyclinginfo
import com.example.myapplication.ui.theme.screens.recyclinginfo.WhatRecycled
import com.example.myapplication.ui.theme.screens.register.RegisterScreen
import com.example.myapplication.ui.theme.screens.wasteredtips.ClothingSwap
import com.example.myapplication.ui.theme.screens.wasteredtips.CompostWaste
import com.example.myapplication.ui.theme.screens.wasteredtips.JunkMail
import com.example.myapplication.ui.theme.screens.wasteredtips.ReUserbleCont
import com.example.myapplication.ui.theme.screens.wasteredtips.Repair
import com.example.myapplication.ui.theme.screens.wasteredtips.SecondHand
import com.example.myapplication.ui.theme.screens.wasteredtips.WasteRedTips
import com.example.myapplication.ui.theme.screens.wasteredtips.ZeroWaste

@Composable
fun AppNavHost(modifier: Modifier, navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_LOGIN) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_REGISTER) { RegisterScreen(navController) }
        composable(ROUTE_ABOUT) { About(navController) }
        composable(ROUTE_HOME) { HomeScreen(navController) }
        composable(ROUTE_LOGIN) { LoginScreen(navController) }
        composable(ROUTE_SCHEDULE){ Schedule(navController)}
        composable(ROUTE_VIEW){ ViewScreen(navController)}
        composable(ROUTE_WASTEREDTIPS){ WasteRedTips(navController)}
        composable(ROUTE_CLOTHSWAP) { ClothingSwap(navController) }
        composable(ROUTE_COMPOSTWASTE){ CompostWaste(navController) }
        composable(ROUTE_JUNKMAIL) { JunkMail(navController) }
        composable(ROUTE_REPAIR ){ Repair(navController) }
        composable(ROUTE_REUSERBLECONT){ ReUserbleCont(navController) }
        composable(ROUTE_SECONGHAND){ SecondHand(navController) }
        composable(ROUTE_ZEROWASTE){ ZeroWaste(navController) }
        composable(ROUTE_BENEFITS){ Benefits(navController) }
        composable(ROUTE_CHALLENGES) { Challenges(navController) }
        composable(ROUTE_CURBSIDE){ Curbside(navController) }
        composable(ROUTE_DROPOFF) { DropOff(navController) }
        composable(ROUTE_EWASTE){ Ewaste(navController) }
        composable(ROUTE_RECYCLINGPROCESS){ RecyclingProcess(navController) }
        composable(ROUTE_WHATISRECYCLED){ WhatRecycled(navController) }
        composable(ROUTE_PREPARATION){ Preparation(navController) }
        composable(ROUTE_RECYCLING){ Recycling(navController) }
        composable(ROUTE_BINLOCATION){ BinLocation(navController)}
        composable(ROUTE_RECYCLINGINFO){ Recyclinginfo(navController)}
    }
}