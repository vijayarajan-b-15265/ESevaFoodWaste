package com.example.esevafood.composables.comp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomNavigationBar() {

    NavigationBar {

        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {

            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(text = item.title, color = MaterialTheme.colorScheme.onBackground)
                    }
                )
            }
        }
    }
}

val items = listOf(
    BottomNavigationItemsObject(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigationItemsObject(
        title = "Add Donation",
        icon = Icons.Rounded.AddCircle
    ),
    BottomNavigationItemsObject(
        title = "Spark Points",
        icon = Icons.Rounded.Star
    ),
    BottomNavigationItemsObject(
        title = "Profile",
        icon = Icons.Rounded.AccountCircle
    )
)

data class BottomNavigationItemsObject(
    val title: String,
    val icon: ImageVector
)


@Preview
@Composable
private fun BottomNavigationPreview() {
    BottomNavigationBar()
}
