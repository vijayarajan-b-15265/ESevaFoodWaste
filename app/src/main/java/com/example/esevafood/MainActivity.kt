package com.example.esevafood

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import com.example.esevafood.ui.theme.fragment.RegisterFragment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                val intent = Intent(this, RegisterFragment::class.java)
                SignUpLayout(
                    onClick = {
                        startActivity(intent)
                    }
                )
            }
        }
    }
}
