package com.sri.composepracticework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sri.composepracticework.ui.theme.ComposePracticeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeWorkTheme {

                Column(
                    modifier = Modifier.fillMaxSize(),

                    ) {
                    Spacer(modifier = Modifier.size(100.dp))
                    Button(
                        onClick = { }, modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .height(60.dp)
                            .width(160.dp),
                        shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
                        enabled = true,
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 30.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black,
                            contentColor = Color.Green,
                            disabledContainerColor = Color.Gray,
                            disabledContentColor = Color.White
                        )
                    ) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null)
                        Text(text = "Click here")
                    }
                    Spacer(modifier = Modifier.size(100.dp))
                    TextButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "This is TextButton")
                    }
                    Spacer(modifier = Modifier.size(200.dp))
                    IconButton(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = null
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeWorkTheme {
        Greeting("Android")
    }
}