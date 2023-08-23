package com.example.getting_started_jetpack

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
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getting_started_jetpack.ui.theme.Getting_Started_JetpackTheme

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

@Preview(showBackground = true)

fun SignupInterface() {
    var Firstname by remember {
        mutableStateOf("")
    }
    var Lastname by remember {
        mutableStateOf("")
    }
    var Phonenumber by remember {
        mutableStateOf("")
    }
    var Email by remember {
        mutableStateOf("")
    }
    var Password by remember {
        mutableStateOf("")
    }

    Column(

        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Welcome to Blacklist. Please login", color = Color.Black, fontSize = 15.sp)
        OutlinedTextField(
            value = Firstname,
            onValueChange = { Firstname },
            label = { Text(text = "Firstname") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = Lastname,
            onValueChange = { Lastname },
            label = { Text(text = "Lastname") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.height(17.dp))

        OutlinedTextField(
            value = Phonenumber,
            onValueChange = { Phonenumber },
            label = { Text(text = "Phonenumber") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = Email,
            onValueChange = { Email },
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = Password,
            onValueChange = { Password },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxSize()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "Sign Up")
        }
    }
}










