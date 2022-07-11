package com.example.rmovies.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.rmovies.R
import com.example.rmovies.ui.theme.GrayBrand

@Composable
fun Splash(navigator: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GrayBrand)
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(32.dp),
            painter = painterResource(id = R.drawable.ic_splash),
            contentDescription = "",
            contentScale = ContentScale.Fit
        )
        Button(
            onClick = { navigator.navigate(Screen.Login.route) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
                .align(Alignment.BottomCenter)
        ) {
            Text(text = "Navigate")
        }
    }
}
