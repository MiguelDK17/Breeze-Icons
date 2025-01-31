package com.migueldk17.breezeicons.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.migueldk17.breezeicons.icons.BreezeIcon
import com.github.migueldk17.breezeicons.icons.BreezeIcons

@Composable
fun ImplementationCard(){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .size(width = 429.dp, height = 80.dp),
            ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                BreezeIcon(
                    BreezeIcons.Linear.BookLinear,
                    contentDescription = null
                )
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun Preview(){
    ImplementationCard()
}