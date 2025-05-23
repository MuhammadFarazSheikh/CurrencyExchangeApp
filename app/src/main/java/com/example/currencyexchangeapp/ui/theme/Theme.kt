package com.example.currencyexchangeapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

val DarkColorTheme = darkColorScheme(
    primary = DarkGrayBlue,
    primaryContainer = Green,
    tertiary = OliveGreen,
    secondary = MintCream,
    background = White
)

val LightColorTheme = darkColorScheme(
    primary = DarkGrayBlue,
    primaryContainer = Green,
    tertiary = OliveGreen,
    secondary = MintCream,
    background = White
)

@Composable
fun AppTheme(
    systemTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit

) {

    MaterialTheme(
        colorScheme = if (systemTheme) DarkColorTheme else LightColorTheme,
        content = content,
        typography = AppTypography
    )

}