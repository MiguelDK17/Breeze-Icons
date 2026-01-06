package com.migueldk17.breezeicons.ui.layout

import android.content.ContentValues.TAG
import android.util.Log
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
fun ImplementationCard(modifier: Modifier = Modifier){
    Column(modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {



        Card(modifier = Modifier
            .size(width = 429.dp, height = 80.dp),
            ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                BreezeIcon(
                    BreezeIcons.Linear.SchoolLearning.BookLinear,
                    contentDescription = null,
                    modifier = Modifier.size(width = 41.dp, height = 32.dp)
                )
                BreezeIcon(
                    BreezeIcons.Linear.Delivery.GroupLinear,
                    contentDescription = null,
                    modifier = Modifier.size(width = 41.dp, height = 32.dp)
                )
                BreezeIcon(
                    BreezeIcons.Linear.Location.GlobeLinear,
                    contentDescription = null,
                    modifier = Modifier.size(width = 41.dp, height = 32.dp)
                )

                BreezeIcon(
                    BreezeIcons.Linear.Mobility.CarLinear,
                    contentDescription = null,
                    modifier = Modifier.size(width = 41.dp, height = 32.dp)
                )
                BreezeIcon(
                    BreezeIcons.Linear.Weather.CloudLinear,
                    contentDescription = null,
                    modifier = Modifier.size(width = 41.dp, height = 32.dp)
                )
                BreezeIcon(
                    BreezeIcons.Unspecified.IconUnspecified,
                    contentDescription = null
                )
                Log.d(TAG, "ImplementationCard: cor do icone verde: ${BreezeIcons.Colors.Vibrant.IconGreen.color}")
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun Preview(){
    ImplementationCard()
}