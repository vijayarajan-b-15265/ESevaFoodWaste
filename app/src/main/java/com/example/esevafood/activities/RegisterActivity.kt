package com.example.esevafood.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import com.example.esevafood.composables.RegisterScreen

class RegisterActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                val intent = Intent(this, IdentificationActivity::class.java)
                RegisterScreen(
                    onClick = {
                        startActivity(intent)
                    }
                )
            }
        }
    }
}