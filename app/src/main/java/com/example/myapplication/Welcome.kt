package com.example.myapplication

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
 Column (modifier= Modifier.focusModifier()
  .fillMaxSize()
  .background(color = Color(0xFFEFB8C8)),
  horizontalAlignment = Alignment.CenterHorizontally
  ,verticalArrangement = Arrangement.Center,){
  Text(text = "Welcome to Task Plus",
   fontSize = 28.sp,
   color = Color(0xFF6650a4)
  )

  Text(
   text = "Todo Plus is a TASK Manager that helps you organize your Task with the priorities",
   fontSize = 21.sp,
  )
  Column (modifier= Modifier.focusModifier(), horizontalAlignment = Alignment.End){
   Button(onClick = { navController.navigate(Routes.HomeScreen)}) {

    Text(text = "GET STARTED")
   }
  }

 }
}