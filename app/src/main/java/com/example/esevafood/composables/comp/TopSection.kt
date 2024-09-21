package com.example.esevafood.composables.comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.esevafood.R

@Composable
fun TopSectionComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Welcome, \nKarthikeyan",
                modifier = Modifier.weight(1f),
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
            )
            Image(
                painter = painterResource(id = R.drawable.avatar),
                modifier = Modifier.size(50.dp),
                contentDescription = null
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Your Impact: Reducing Food Waste & Helping Communities",
            style = TextStyle(color = Color.Gray, fontWeight = FontWeight.SemiBold),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TopSectionPreview() {
    TopSectionComponent()
}