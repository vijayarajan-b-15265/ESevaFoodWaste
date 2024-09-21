package com.example.esevafood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun SignUpLayout() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(40.dp)

        ) {

            Column(
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hackathon_image_2),
                    contentDescription = "ESeva",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(200.dp)
                        .height(220.dp)
                        .padding(top = 50.dp)
                )

                Text(
                    text = "Register",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(8.dp),
                        color = MaterialTheme.colorScheme.outline
                    )
                    .padding(top = 10.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.eseva_user_logo),
                    contentDescription = "User"
                )
                Spacer(
                    modifier = Modifier.width(10.dp)
                )
                Text(
                    text = "Family/ Individual Donor",
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        shape = RoundedCornerShape(8.dp),
                        color = MaterialTheme.colorScheme.outline
                    )
                    .padding(top = 10.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.eseva_user_org_logo),
                    contentDescription = "User"
                )
                Spacer(
                    modifier = Modifier.width(10.dp)
                )
                Text(
                    text = "Organisation Donor",
                )
            }

            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .background(
                            color = Color.Black
                        )
                        .weight(1f)
                )
                Text(
                    text = "or",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(10.dp)
                )

                Spacer(
                    modifier = Modifier
                        .height(1.dp)
                        .background(
                            color = Color.Black
                        )
                        .weight(1f)
                )
            }

            Text(
                text = "Sign in with password",
                modifier = Modifier
                    .background(color = Color(0xFF5F61F0), RoundedCornerShape(8.dp))
                    .padding(25.dp),
            )

        }
    }
}