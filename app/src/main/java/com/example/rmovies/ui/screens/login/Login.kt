package com.example.rmovies.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rmovies.R
import com.example.rmovies.ui.theme.*
import com.example.rmovies.utils.LoginButton
import com.example.rmovies.utils.Margin24
import com.example.rmovies.utils.Margin48

@Composable
fun Login() {
    LoginContent()
}

@Composable
fun LoginContent(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = GrayBrand)
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            painter = painterResource(id = R.drawable.background_movies),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            GrayTransparent,
                            BlackTransparent
                        ),
                        startY = 500f
                    )
                )
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(0.90f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginButton("Cadastar-se com o Google", R.drawable.ic_google, GoogleRed, onClick = {})
            Margin24()
            LoginButton("Cadastar-se com o Facebook", R.drawable.ic_facebook, FacebookBlue, onClick = {})
            Margin48()
            Spacer(modifier = Modifier.height(1.dp).fillMaxWidth(0.15f).background(Color.White))
            Margin48()
            Text(
                text = "VER MAIS OPÇÕES",
                modifier = Modifier.fillMaxWidth(),
                color = YellowBrand,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Margin48()
            Text(
                text = buildAnnotatedString {
                    append("Ao se cadastrar, você concorda com nossos ")
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(" Termos")
                    }
                    append(" e nossa")
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(" Política de Privacidade")
                    }
                },
                color = Color.White,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(
                modifier = Modifier
                    .height(96.dp)
                    .fillMaxWidth()
            )
        }
    }
}