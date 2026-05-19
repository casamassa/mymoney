package com.example.mymoney.Activities.DashboardActivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mymoney.R

@Composable
fun BottomNavigationBar(onSelectedItem:(Int)->Unit,
                        modifier: Modifier) {
    NavigationBar(
        containerColor = colorResource(R.color.lightBlue),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { onSelectedItem(R.id.wallet) },
            icon = {
                Icon(painter = painterResource(R.drawable.wallet), contentDescription = null)
            },
            label = { Text(text="Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onSelectedItem(R.id.market) },
            icon = {
                Icon(painter = painterResource(R.drawable.market), contentDescription = null)
            },
            label = { Text(text="Market") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onSelectedItem(R.id.trade) },
            icon = {
                Icon(painter = painterResource(R.drawable.trade), contentDescription = null)
            },
            label = { Text(text="Trade") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onSelectedItem(R.id.futures) },
            icon = {
                Icon(painter = painterResource(R.drawable.futures), contentDescription = null)
            },
            label = { Text(text="Futures") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { onSelectedItem(R.id.profile) },
            icon = {
                Icon(painter = painterResource(R.drawable.profile), contentDescription = null)
            },
            label = { Text(text="Profile") }
        )
    }
}