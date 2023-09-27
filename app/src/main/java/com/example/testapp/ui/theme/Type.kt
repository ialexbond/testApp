package com.example.testapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.testapp.R

// Set of Material typography styles to start with
val Typography: Typography
    get() = Typography(
        // Body Bold
        bodyLarge = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(600),
        ),

        // Large title
        titleLarge = TextStyle(
            fontSize = 34.sp,
            lineHeight = 41.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(700),
            letterSpacing = 0.37.sp,
        ),

        // Headline Large
        headlineLarge = TextStyle(
            fontSize = 24.sp,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(600),
        ),

        // Headline
         headlineMedium = TextStyle(
            fontSize = 16.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(600),
        ),

        // Body
        bodyMedium = TextStyle(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(400),
        ),

        // labelSmall
        labelSmall = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontFamily = FontFamily(Font(R.font.fonts)),
            fontWeight = FontWeight(400),
        ),
    )