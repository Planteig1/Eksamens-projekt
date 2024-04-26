package com.example.eksamens_projekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.eksamens_projekt.navigation.Navigation
import com.example.eksamens_projekt.ui.ActivityScreen.ActivityScreen
import com.example.eksamens_projekt.ui.RegisterScreen.CreateUserScreen
import com.example.eksamens_projekt.ui_elements.theme.EksamensProjektTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EksamensProjektTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ActivityScreen()

                }
            }
        }
    }
}
