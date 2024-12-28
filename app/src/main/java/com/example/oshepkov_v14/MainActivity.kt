package com.example.oshepkov_v14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oshepkov_v14.ui.theme.Oshepkov_v14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Oshepkov_v14Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Authorization()
                }
            }
        }
    }
}

@Composable
fun Authorization() {
    Box() {
        Image(painter = painterResource(id = R.drawable.film),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 500.dp))
            val message = remember { mutableStateOf("Hello World") }
            Column {
                TextField(modifier = Modifier
                    .offset(x = 50.dp, y = 400.dp),
                    value = message.value,
                    onValueChange = { newText -> message.value = newText },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                TextField(modifier = Modifier
                    .offset(x = 50.dp, y = 450.dp),
                    value = message.value,
                    onValueChange = { newText -> message.value = newText },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Button(
                    onClick = {/* Действие при нажатии */},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(64, 123, 255)),
                    modifier = Modifier
                        .width(280.dp)
                        .height(60.dp)
                        .offset(x = 50.dp, y = 500.dp)
                ) {
                    Text(
                        text = "Войти в кинозал",
                        color = Color.White,
                        style = TextStyle(fontSize = 25.sp)
                    )
                }
        }
        Box(modifier = Modifier
            .background(Color(200, 200, 200))
            .height(40.dp)
            .align(Alignment.BottomEnd)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .padding(horizontal = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.recent_apps), // Замените на ваш ресурс
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)

                )
                Image(
                    painter = painterResource(id = R.drawable.home), // Замените на ваш ресурс
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.back), // Замените на ваш ресурс
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Oshepkov_v14Theme {
        Authorization()
    }
}