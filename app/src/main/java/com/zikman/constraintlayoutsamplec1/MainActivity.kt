package com.zikman.constraintlayoutsamplec1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.zikman.constraintlayoutsamplec1.ui.Screens.FormScreen
import com.zikman.constraintlayoutsamplec1.ui.theme.ConstraintLayoutSampleC1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConstraintLayoutSampleC1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FormScreen()
                }
            }
        }
    }
}