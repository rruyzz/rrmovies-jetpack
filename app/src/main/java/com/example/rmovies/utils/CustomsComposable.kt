package com.example.rmovies.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.rmovies.R
import com.example.rmovies.ui.theme.GoogleRed

@Composable
fun LoginButton(buttonText: String, icon: Int, color: Color, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(36.dp),
        onClick = {

        },
        colors = ButtonDefaults.buttonColors(backgroundColor = color),
        shape = RoundedCornerShape(36.dp)
    ) {
        Row(){
            Image(painterResource(id = icon), contentDescription = "")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = buttonText, color = Color.White)
        }

    }
}