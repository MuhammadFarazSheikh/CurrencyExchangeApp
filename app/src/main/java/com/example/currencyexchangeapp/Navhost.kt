package com.example.currencyexchangeapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.feature.presentation.composables.CurrencyConverterUi

@Composable
fun AppNavHost(
    paddingValues: PaddingValues
) {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
            .wrapContentHeight(),
        navController = navController,
        startDestination = NavHostScreens.CurrencyConverter.route,
        builder = {
            CurrencyConverter()
        })
}

fun NavGraphBuilder.CurrencyConverter() {
    composable(NavHostScreens.CurrencyConverter.route) {
        CurrencyConverterUi()
    }
}