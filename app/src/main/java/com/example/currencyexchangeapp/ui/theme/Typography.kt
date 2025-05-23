package com.example.currencyexchangeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.currencyexchangeapp.R

val MyFontFamily = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

val AppTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Bold, fontSize = 36.sp
    ), titleLarge = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Bold, fontSize = 22.sp
    ), bodyMedium = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Medium, fontSize = 16.sp
    ), bodySmall = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Medium, fontSize = 20.sp
    ), labelSmall = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Normal, fontSize = 11.sp
    ), labelMedium = TextStyle(
        fontFamily = MyFontFamily, fontWeight = FontWeight.Medium, fontSize = 17.sp
    )
)