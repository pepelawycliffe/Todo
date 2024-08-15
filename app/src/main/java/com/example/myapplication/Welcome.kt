package com.example.myapplication

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
 Column (modifier= Modifier
  .fillMaxSize()
  .background(color = Color(0xFFEFB8C8)),
  horizontalAlignment = Alignment.CenterHorizontally
  ,verticalArrangement = Arrangement.Center,){
  Text(text = "Welcome to Task Plus",
   fontSize = 28.sp,
   color = Color(0xFF6650a4)
  )
  Spacer(modifier = Modifier.height(50.dp))
 Column(modifier = Modifier,
  verticalArrangement = Arrangement.Center,
  horizontalAlignment = Alignment.CenterHorizontally) {
  Text(
   text = "Todo Plus is a TASK Manager that helps you organize your Task with the priorities",
   textAlign = TextAlign.Center,
   fontSize = 21.sp,
  )
 }
  Spacer(modifier = Modifier.height(10.dp))
  Column (modifier= Modifier.size(300.dp),
   verticalArrangement = Arrangement.Bottom,
   horizontalAlignment = Alignment.CenterHorizontally
  ){
   Button(onClick = { navController.navigate(Routes.HomeScreen)}, Modifier.size(width = 200.dp, height = 60.dp)) {

    Text(text = "GET STARTED")
   }
  }

 }
}