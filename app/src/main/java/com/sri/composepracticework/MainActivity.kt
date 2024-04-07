package com.sri.composepracticework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sri.composepracticework.ui.theme.ComposePracticeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeWorkTheme {
                Column(modifier = Modifier.fillMaxSize().background(Color.Green)) {
                    Spacer(modifier = Modifier.size(16.dp))
                    Text(
                        text = stringResource(id = R.string.srikanth).plus(" ").repeat(30),
                        maxLines = 3,
                        color = Color.Blue,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    Text(
                        text = "Pawan Kalyan",
                        color = Color.White,
                        fontSize = 32.sp,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline,
                    )
                    Spacer(modifier = Modifier.size(16.dp))

                    val annotatedString = buildAnnotatedString {
                        GradientText("Vyshakh")
                    }
                    Text(text = annotatedString)

                }
            }
        }
    }

    private fun AnnotatedString.Builder.GradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Black,
                        Color.Red
                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.W400
            )
        ) {
            append(text)
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