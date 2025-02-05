package com.github.migueldk17.breezeicons.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

//Classe que é usada para tipar os icones
sealed class BreezeIconsType(val color: Color = Color.Unspecified) {
    //Icones Coloridos
     class ColorIcon(val icon: ImageVector,color: Color): BreezeIconsType(color)
    //Icones Lineares
    data class LinearIcon(val icon: ImageVector): BreezeIconsType()

    //Icone não especificado, será usado apenas para tipagem
    data object Unspecified : BreezeIconsType()
}