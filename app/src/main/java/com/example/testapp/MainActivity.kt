@file:Suppress("FunctionName")

package com.example.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FrostedGlassButton {

                    }
                }
            }
        }
    }
@Composable
    fun FrostedGlassButton(
        onClick: () -> Unit
    ) {
        val brush = Brush.verticalGradient(
            colors = listOf(Color.Transparent, Color.White), // Прозрачность кнопки
            startY = 0f,
            endY = 50f
        )

    Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = brush) // Применяем вертикальный градиент для прозрачности
        ) {

        Button(
            onClick = onClick,
            modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .align(Alignment.Center)
                    .padding(16.dp)
                    .alpha(alpha = 0.5f)
            ) {

            Text(
                text = "Моя кнопка",
                color = Color.White) // Цвет текста кнопки
            }
        }
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TestAppTheme {
//        Greeting("Test")
//    }
//}