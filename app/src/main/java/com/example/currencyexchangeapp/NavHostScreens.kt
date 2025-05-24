package com.example.currencyexchangeapp

sealed class NavHostScreens(val route: String) {
    data object CurrencyConverter : NavHostScreens("CurrencyExchange")
    data object ExchangeRates : NavHostScreens("ExchangeRates")
}