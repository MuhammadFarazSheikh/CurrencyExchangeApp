package com.example.currencyexchangeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import com.example.currencyexchangeapp.ui.theme.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            ComposeView(this).apply {
                setContent {
                    AppTheme {
                        AppScaffold()
                    }
                }
            }
        )

    }

    @Composable
    fun AppScaffold()
    {
        Scaffold (
            containerColor = MaterialTheme.colorScheme.background,
            topBar = {
                AppTopBar()
            },
            content = { paddingValues ->

            }
        )
    }
}