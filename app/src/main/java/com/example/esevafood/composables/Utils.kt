package com.example.esevafood.composables

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.animateFloat
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BottomButtonLarge(
    backgroundColour: Color = Color(0xFF5F61F0),
    buttonName: String = "Sign in with password",
    onClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = buttonName,
            modifier = Modifier
                .background(color = backgroundColour, RoundedCornerShape(8.dp))
                .padding(top = 10.dp, bottom = 10.dp, start = 30.dp, end = 30.dp),
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }


}

@Composable
fun InputField(
    mutableField: MutableState<String>,
    fieldName: String,
    fieldHint: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = fieldName, color = Color.Black, fontSize = 14.sp)
        BasicTextField(
            value = mutableField.value,
            onValueChange = {
                mutableField.value = it
            },
            keyboardActions = KeyboardActions.Default,
            keyboardOptions = KeyboardOptions.Default,
            cursorBrush = SolidColor(Color.Black),
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFFD7D7D7),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
        ) {
            if (mutableField.value.isEmpty()) {
                Text(
                    text = fieldHint,
                    style = TextStyle(
                        color = Color(0xFFD7D7D7),
                        fontSize = 14.sp
                    )
                )
            } else {
                Text(
                    text = mutableField.value,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                )
            }
        }
    }


}