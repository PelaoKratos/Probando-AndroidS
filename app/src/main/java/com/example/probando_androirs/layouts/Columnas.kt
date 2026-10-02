package com.example.probando_androirs.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun Saludos(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical= 50.dp, horizontal = 16.dp)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize()
            .background(color=Color.Red)
    ) {
        Text(text="Hola con Android",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color= Color.White)
        Text(text = "Hola Wacoldo desde Column")

    }
}