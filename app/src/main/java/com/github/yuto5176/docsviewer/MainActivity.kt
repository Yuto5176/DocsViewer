package com.github.yuto5176.docsviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import com.github.yuto5176.docsviewer.ui.App

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpContent()
    }

    private fun setUpContent(){
        setContent {
            App()
        }
    }
}

