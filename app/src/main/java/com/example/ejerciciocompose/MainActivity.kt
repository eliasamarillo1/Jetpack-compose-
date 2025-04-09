package com.example.ejerciciocompose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejerciciocompose.ui.theme.EjercicioComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            app()

        }
    }
    @Preview(showBackground = true)
    @Composable
    fun app() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Red)
                .padding(10.dp)
        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Imagen"

                )
                Row{
                    Image(
                        modifier = Modifier


                    )

                }

                Text(
                    text = "Prueba JetPack", fontSize = 25.sp,
                    color = androidx.compose.ui.graphics.Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Text(text = "xd")
                Text(text = "Elias")
                Text(text = "No se que decirte")

                LazyRow(modifier = Modifier.fillMaxWidth()
                    .padding(top = 10.dp)){

                   item{
                       Text(text = "Stack: ", color= androidx.compose.ui.graphics.Color.White)
                       Text(text = " Java ", color= androidx.compose.ui.graphics.Color.White)
                       Text(text=" Kotlin ", color= androidx.compose.ui.graphics.Color.White)

                   }

                }
            }

        }

    }
}

