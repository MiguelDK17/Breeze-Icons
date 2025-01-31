package com.migueldk17.breezeicons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.migueldk17.breezeicons.ui.layout.ImplementationCard
import com.migueldk17.breezeicons.ui.theme.BreezeIconsTheme


class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            BreezeIconsTheme  {
                Scaffold { paddingValues ->
                    ImplementationCard(Modifier.padding(paddingValues))
                }
            }
        }

    }

}