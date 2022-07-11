package com.example.rmovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rmovies.navigation.Navigation
import com.example.rmovies.ui.theme.RmoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RmoviesTheme {
                Navigation()
            }
        }
    }
}

@Composable
fun ShowCard(
    painter: Painter = painterResource(id = R.drawable.emilia_clarke),
    modifier: Modifier = Modifier,
    actorName: String = "",
    subtitle: String = ""
) {
    Card(
        modifier = modifier.fillMaxWidth(0.3f),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = actorName,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(actorName, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RmoviesTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewCard() {
    RmoviesTheme {
        val painter = painterResource(id = R.drawable.background_login)
        val actorName = "Emilia Clarke"
        val subtitle = "Dayneares"
//            ImageBackground(painter)
        ShowCard(painter, actorName = actorName, subtitle = subtitle)

    }
}