package com.github.migueldk17.breezeicons.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

//Classe que é usada para tipar os icones
sealed class BreezeIconsType(val enum: BreezeIconsEnum = BreezeIconsEnum.ICON_UNSPECIFIED, val color: Color = Color.Unspecified) {
    //Icones Coloridos
     class ColorIcon(val icon: ImageVector,color: Color, enum: BreezeIconsEnum): BreezeIconsType(enum)
    //Icones Lineares
     class LinearIcon(val icon: ImageVector,  enum: BreezeIconsEnum): BreezeIconsType(enum)

    //Icone não especificado, será usado apenas para tipagem
    data object Unspecified : BreezeIconsType()
}