package com.example.ejerciciocompose

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejerciciocompose.ui.theme.EjercicioComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewContainer()

        }
    }

    @Preview
    @Composable
    fun ViewContainer() {
        Scaffold(
            topBar = {Toolbar()},
            content = {Content()}

        )

    }
    @Preview
    @Composable
    fun Toolbar(
    ){
        TopAppBar(title= {Text(text="Elias profile")},
            colors =
                TopAppBarDefaults
                    .topAppBarColors
                        (containerColor = colorResource(id = R.color.purple_700)))
    }

    @Preview(showBackground = true)
    @Composable
    fun Content() {
        var counter by rememberSaveable { mutableStateOf(0) }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Red)
                .padding(20.dp)
        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Imagen"

                )
                Row(modifier = Modifier.padding(top = 8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.huevandroid),
                        contentDescription = null,
                        modifier = Modifier.clickable { counter++ }
                    )
                    Text(
                        text = counter.toString(),
                        color = androidx.compose.ui.graphics.Color.White,
                        modifier = Modifier.padding(start = 10.dp)
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

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {

                    item {
                        Text(text = "Stack: ", color = androidx.compose.ui.graphics.Color.White)
                        Text(text = " Java ", color = androidx.compose.ui.graphics.Color.White)
                        Text(text = " Kotlin ", color = androidx.compose.ui.graphics.Color.White)
                    }
                }
            }
        }
    }
}

