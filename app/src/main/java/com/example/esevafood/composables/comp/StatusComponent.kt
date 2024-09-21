package com.example.esevafood.composables.comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.esevafood.R

@Composable
fun StatusComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp)
            .background(shape = RoundedCornerShape(8.dp), color = Color(0xFFF4F4F4))
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 16.dp)
                .padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.spark),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "1002",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                )
                Text(text = "Spark Points", style = TextStyle(fontWeight = FontWeight.Bold))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StatusCompoentPreview() {
    StatusComponent()
}