package com.example.esevafood.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun RegisterScreen(
    onClick: () -> Unit = {}
) {
    val nameField: MutableState<String> = remember {
        mutableStateOf("")
    }
    val mobileField: MutableState<String> = remember {
        mutableStateOf("")
    }
    val emailField: MutableState<String> = remember {
        mutableStateOf("")
    }
    val passwordField: MutableState<String> = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 70.dp, start = 20.dp, end = 20.dp, bottom = 70.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            // Title
            Text(
                text = "Register as an Individual/Family", style = TextStyle(
                    fontSize = 24.sp, color = Color.Black, fontWeight = FontWeight.Bold
                )
            )

            Text(
                text = "Join our mission to reduce food waste by donating or receiving excess food. ",
                style = TextStyle(
                    fontSize = 14.sp, color = Color(0xFF444444), fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(bottom = 10.dp)
            )

            InputField(
                fieldName = "Full Name",
                fieldHint = "Enter your full name",
                mutableField = nameField
            )
            InputField(
                fieldName = "Mobile Number",
                fieldHint = "Enter your Mobile number",
                mutableField = mobileField
            )
            InputField(
                fieldName = "Email Address",
                fieldHint = "Enter your email id",
                mutableField = emailField
            )
            InputField(
                fieldName = "Password",
                fieldHint = "Enter your password",
                mutableField = passwordField
            )
        }

        Row {
            BottomButtonLarge(
                backgroundColour = Color(0xFFFE0000), buttonName = "Continue",
                onClick = onClick
            )
        }


    }
}