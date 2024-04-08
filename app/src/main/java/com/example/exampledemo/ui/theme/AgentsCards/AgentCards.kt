package com.example.exampledemo.ui.theme.AgentsCards

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.exampledemo.DataItem
import com.example.exampledemo.ui.theme.AgentDetails.AgentDetails


@Composable
fun AgentsCard(dataItem: DataItem) {
    Box(
        Modifier
            .height(200.dp)
            .background(Color.Transparent)
            .padding(horizontal = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Blue, shape = RoundedCornerShape(20.dp))
                .fillMaxWidth()
                .fillMaxHeight(0.8f)
                .align(Alignment.BottomCenter)

        ) {
            Text(
                text = dataItem.role?.displayName ?: "Error",
                maxLines = 1,
                style = TextStyle(

                    fontSize = if (dataItem.role?.displayName == "Controller") {
                        60.sp
                    } else {
                        70.sp
                    },
                    letterSpacing = 20.sp,
                    color = Color.White.copy(alpha = 0.1f),

                    ),
                modifier = Modifier.align(
                    Alignment.Center
                )

            )

        }
        Image(
            contentScale = ContentScale.Fit,
            painter = rememberAsyncImagePainter(dataItem.fullPortrait),
            contentDescription = null,
            modifier = Modifier

                .align(Alignment.CenterStart)
                .graphicsLayer {
                    translationY = (-50).toFloat()
                    translationX = (-100).toFloat()
                }
                .padding(start = 10.dp)
        )
        Button(onClick = {  }) {
            
        }
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(start = 40.dp)
        ) {
            Text(
                dataItem.displayName ?: "Error",
                fontSize = 30.sp,
                color = Color.White,


                )
            Row {
                Text("")
            }
        }
    }
}
