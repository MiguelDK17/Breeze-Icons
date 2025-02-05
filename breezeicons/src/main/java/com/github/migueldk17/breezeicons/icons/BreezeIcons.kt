package com.github.migueldk17.breezeicons.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.github.migueldk17.breezeicons.R

//Object que usa os icones
object BreezeIcons {

    //Icones Lineares
    object Linear {
        val BookLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_book))

        val GroupLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_group))

        val CarLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_car))

        val CloudLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_cloud))

        val GlobeLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_global))

        val AirplaneLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_airplane))

        val DiscoverLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_discover))

        val DropLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_drop))

        val KeyLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(ImageVector.vectorResource(R.drawable.ic_key))
    }

    //Icones de Cores
    object Colors {
        val IconOrange: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(icon = ImageVector.vectorResource(R.drawable.icon_orange), color = Color(0xFFF8C543))

        val IconYellow: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(icon = ImageVector.vectorResource(R.drawable.icon_yellow), color = Color(0xFFF5F843))

        val IconGreen: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(icon = ImageVector.vectorResource(R.drawable.icon_green), color = Color(0xFF6DED57))

        val IconGreenCyan: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(icon = ImageVector.vectorResource(R.drawable.icon_green_cyan), color = Color(0xFF43F89D))

        val IconTurquoise: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(icon = ImageVector.vectorResource(R.drawable.icon_turquoise), color = Color(0xFF43F8D4))
    }

    object Unspecified {
        val IconUnspecified: BreezeIconsType
            get() = BreezeIconsType.Unspecified

    }




}