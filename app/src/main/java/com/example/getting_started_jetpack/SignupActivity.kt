package com.example.getting_started_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Image(painter = painterResource(R.drawable.logo),
            contentDescription = null,
        modifier = Modifier
            .size(250.dp)
            .border(3.dp, Color.White))

        Text(text = "Welcome to Blacklist. Please signup", color = Color.Black, fontSize = 15.sp)
        OutlinedTextField(value = Firstname,
            onValueChange = { Firstname },
            label = { Text(text = "Firstname") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = Lastname,
            onValueChange = { Lastname },
            label = { Text(text = "Lastname") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(17.dp))

        OutlinedTextField(value = Phonenumber,
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription ="phonenumber icon" ) },
            onValueChange = { Phonenumber },
            label = { Text(text = "Phonenumber") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = Email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="email icon" ) },
            onValueChange = { Email },
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = Password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="password icon" ) },
            onValueChange = { Password },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()
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










