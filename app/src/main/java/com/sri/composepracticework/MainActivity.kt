package com.sri.composepracticework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.sri.composepracticework.ui.theme.ComposePracticeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Srikanth")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.TopStart
            )
        )
        Text(
            text = "Greetings $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.TopCenter
            )
        )
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.TopEnd
            )
        )
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.CenterStart
            )
        )
        Text(
            text = "Greetings $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.Center
            )
        )
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.CenterEnd
            )
        )
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.BottomStart
            )
        )
        Text(
            text = "Greetings $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.BottomCenter
            )
        )
        Text(
            text = " $name",
            color = androidx.compose.ui.graphics.Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(
                Alignment.BottomEnd
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeWorkTheme {
        Greeting("Srikanth")
    }
}