package com.example.getting_started_jetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_jetpack.ui.theme.Getting_Started_JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Home()
        }
    }
}

@Preview(showBackground = true)
@Composable

fun Home(){
   Column(
   horizontalAlignment = Alignment.CenterHorizontally,
   verticalArrangement = Arrangement.Center

           ,
       modifier = Modifier
           .background(Color.Transparent)
           .fillMaxSize()
   ) {
       Text(text = "Welcome to my App", color = Color.Green, fontSize = 30.sp)
       Spacer(modifier = Modifier.height(12.dp))

       var login = LocalContext.current

       Button({
           login.startActivity(Intent(login, LoginActivity::class.java))

       }


       ) {
           Text(text = "LOGIN")


       }
   }

}
