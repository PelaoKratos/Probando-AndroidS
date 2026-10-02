package com.example.probando_androirs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//Importacion de Columnas
import com.example.probando_androirs.layouts.Saludos
import com.example.probando_androirs.ui.theme.ProbandoAndroirSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Saludos()
               // Saludar();
           // SaludarConNombre("Diogenes")
        }
    }
}
/*
@Composable
fun Saludar(){
    Text(
        text="Hola Wacoldo",
        modifier = Modifier.padding(vertical = 40.dp, horizontal = 20.dp)
    )
}

@Composable
fun SaludarConNombre(nombre:String){
    Text(
        text="Hola ${nombre}",
        modifier = Modifier.padding(vertical = 66.dp, horizontal = 20.dp)
    )
}
*/