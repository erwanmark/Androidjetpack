package com.example.getting_started_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_jetpack.ui.theme.Getting_Started_JetpackTheme

class Listviewex : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyList()

        }
    }
}

private val countryList = mutableListOf("Kenya", "Burundi","Uganda", "Mozambique")
private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Black)
    .padding(13.dp)

private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp, color = Color.Green)
@Composable
@Preview(showBackground = true)

fun MyList(){
    LazyColumn(modifier = listModifier) {
        items(countryList) {
            country->
            Text(text = country, style = textStyle)
        }
    }
}




