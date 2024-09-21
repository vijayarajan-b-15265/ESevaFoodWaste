package com.example.esevafood.composables.comp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.esevafood.R

@Composable
fun CardComponent(icon: Int, title: String, description: String) {
    Row(
        modifier = Modifier
            .width(200.dp)
            .padding(horizontal = 6.dp)
            .wrapContentHeight()
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
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = title,
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                )
                Text(text = description, style = TextStyle(fontWeight = FontWeight.Bold))
            }
        }
    }
}

@Composable
fun FoodDonation(id: Int) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .background(color = Color(0xFFF4F4F4), shape = RoundedCornerShape(8.dp))
            .padding(15.dp)
        ,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.distance_icon),
                contentDescription = "location"
            )
            Text(
                text = "Food Donation $id",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "Status  :"
            )

            Text(
                text = "Completed"
            )

        }

    }


}

@Preview
@Composable
private fun CardComponentsPreview() {
    CardComponent(icon = R.drawable.spark, description = "Spark points", title = "23")
}