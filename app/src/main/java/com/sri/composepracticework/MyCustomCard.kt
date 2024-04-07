package com.sri.composepracticework

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class Publisher(
    val name: String,
    @DrawableRes val image: Int,
    val job: String
)


@Composable
fun MyCustomCard(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
    title: String,
    text: String,
    publisher: Publisher
) {

    var showFullText by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ) {
        Column {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier.padding(horizontal = 15.dp, vertical = 20.dp)) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    modifier = Modifier.clickable {
                        showFullText = !showFullText
                    },
                    text = text,
                    color = Color.White.copy(alpha = 0.7f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    maxLines = if (showFullText)100 else 2 ,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.size(32.dp))
                Row {
                    Image(
                        painter = painterResource(id = publisher.image),
                        contentDescription = null,
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.size(16.dp))
                    val annotatedString = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.White,
                                fontSize = 18.sp
                            )
                        ) {
                            append(publisher.name)
                        }
                        append("\n")
                        withStyle(
                            style = SpanStyle(
                                color = Color.White.copy(alpha = 0.7f),
                                fontSize = 16.sp
                            )
                        ) {
                            append(publisher.job)
                        }
                    }
                    Text(text = annotatedString)
                }
            }
        }
    }
}