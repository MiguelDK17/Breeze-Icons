package com.github.migueldk17.breezeicons.icons

import androidx.compose.ui.graphics.vector.ImageVector

//Classe que é usada para tipar os icones
sealed class BreezeIconsType {
    //Icones Coloridos
    data class ColorIcon(val icon: ImageVector): BreezeIconsType()
    //Icones Lineares
    data class LinearIcon(val icon: ImageVector): BreezeIconsType()

    //Icone não especificado, será usado apenas para tipagem
    data object Unspecified : BreezeIconsType()
}