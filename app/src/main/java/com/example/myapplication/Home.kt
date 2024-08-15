package com.example.myapplication

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Column(modifier = Modifier
        .background(color = Color(0xFF6650a4))
        .fillMaxSize()) {
        Column (modifier= Modifier.padding(35.dp)
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (modifier = Modifier.padding(5.dp),
                verticalArrangement = Arrangement.Top
                ,horizontalAlignment = Alignment.Start){
                ElevatedCard (
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    ),modifier = Modifier
                        .size(width = 420.dp, height = 100.dp)
                ){
                    Text(text = "Hello this is a card view",modifier = Modifier
                        .padding(16.dp),
                        textAlign = TextAlign.Center,)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
            verticalArrangement = Arrangement.Bottom
            ,horizontalAlignment = AbsoluteAlignment.Right) {
            Column (modifier = Modifier
                .padding(5.dp),
                verticalArrangement = Arrangement.Top
                ,horizontalAlignment = Alignment.Start){
                ExtendedFloatingActionButton(
                    onClick = { ""}) {
                    Icon(Icons.Filled.Edit, "Large floating action button")
                }

            }
        }

    }

}