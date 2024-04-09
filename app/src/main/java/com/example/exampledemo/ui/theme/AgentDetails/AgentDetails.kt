package com.example.exampledemo.ui.theme.AgentDetails

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.exampledemo.DataItem



//@Composable
//fun AgentDetails(dataItem:DataItem){
//    Box (
//
//    ){
//        Image(
//            painter = rememberAsyncImagePainter(dataItem.fullPortrait),
//            contentDescription = null,
//            modifier = Modifier.align(Alignment.Center)
//                .graphicsLayer {
//                    translationY = (-50).toFloat()
//                    translationX = (-100).toFloat()
//                }
//
//
//            )
//    }
//
//}