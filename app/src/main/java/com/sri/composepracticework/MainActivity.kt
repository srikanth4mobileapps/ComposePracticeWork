@file:Suppress("UNUSED_EXPRESSION")

package com.sri.composepracticework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sri.composepracticework.ui.theme.ComposePracticeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeWorkTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    var textState by remember {
                        mutableStateOf("")
                    }

                    val namesListState = remember {
                        mutableListOf<String>()
                    }

                    LazyColumn(modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)) {
                            items(namesListState.size) {
                                Text(text = namesListState[it])
                            }
                    }

                    MyTextField(
                        textValue = textState,
                        onValueChange = {
                            textState = it
                        },
                        onAddClick = {
                            namesListState.add(textState)
                                textState = ""
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MyTextField(
    textValue: String,
    onValueChange: (String) -> Unit,
    onAddClick: () -> Unit
) {
    TextField(
        value = textValue, onValueChange = {
            onValueChange(it)
        }, modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "",
                modifier = Modifier.clickable { onAddClick })
        }
    )
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