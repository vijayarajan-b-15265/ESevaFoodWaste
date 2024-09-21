package com.example.esevafood.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.esevafood.R
import com.example.esevafood.composables.comp.BottomNavigationBar
import com.example.esevafood.composables.comp.CardComponent
import com.example.esevafood.composables.comp.FoodDonation
import com.example.esevafood.composables.comp.StatusComponent
import com.example.esevafood.composables.comp.TopSectionComponent

@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            TopSectionComponent()
            Spacer(modifier = Modifier.height(24.dp))
            StatusComponent()
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                CardComponent(
                    icon = R.drawable.donation,
                    description = "Total \n Donation",
                    title = "23"
                )
                CardComponent(
                    icon = R.drawable.food,
                    description = "Food Distributed",
                    title = "124"
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Recent Donation",
                    modifier = Modifier.weight(1f),
                    style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                )
                Text(
                    text = "See all",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                )
            }
            Spacer(modifier = Modifier.height(12.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp)
            ) {
                items(10) {
                    FoodDonation(it + 1)
                    if (it == 9) {
                        Spacer(Modifier.height(30.dp))
                    }
                }
            }

        }
    }
}