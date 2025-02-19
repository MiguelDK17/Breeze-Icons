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

        object Company {
            val FacebookLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.facebook),
                enum = BreezeIconsEnum.FACEBOOK_LINEAR
            )
            val GoogleLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.google),
                enum = BreezeIconsEnum.GOOGLE_LINEAR
            )
        }
        object Essetional {
            val DiscoverLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_discover),
                    enum = BreezeIconsEnum.DISCOVER_LINEAR)

        }
        object Delivery {
            val GroupLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_group),
                    enum = BreezeIconsEnum.GROUP_LINEAR)

        }

        object Location {
            val GlobeLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_global),
                    enum = BreezeIconsEnum.GLOBE_LINEAR
                )
        }

        object Mobility {
            val CarLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_car),
                    enum = BreezeIconsEnum.CAR_LINEAR)

            val AirplaneLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_airplane),
                    enum = BreezeIconsEnum.AIRPLANE_LINEAR
                )
            val BusLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.bus),
                enum = BreezeIconsEnum.BUS_LINEAR
            )
        }

        object SchoolLearning {
            val BookLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_book),
                    enum = BreezeIconsEnum.BOOK_LINEAR)

        }

        object Security {
            val KeyLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_key),
                    enum = BreezeIconsEnum.KEY_LINEAR)
        }
        object Shop {
            val Bag2: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.bag_2),
                enum = BreezeIconsEnum.BAG2_LINEAR
            )
        }

        object Time {
            val CalendarLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.calendar),
                enum = BreezeIconsEnum.CALENDAR_LINEAR
            )
        }

        object Weather {
            val CloudLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_cloud),
                    enum = BreezeIconsEnum.CLOUD_LINEAR)

            val DropLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_drop),
                    enum = BreezeIconsEnum.DROP_LINEAR
                )

        }














    }

    //Icones de Cores
    object Colors {
        val IconOrange: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(
                icon = ImageVector.vectorResource(R.drawable.icon_orange),
                color = Color(0xFFF8C543),
                enum = BreezeIconsEnum.ICON_ORANGE
            )

        val IconYellow: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(
                icon = ImageVector.vectorResource(R.drawable.icon_yellow),
                color = Color(0xFFF5F843),
                enum = BreezeIconsEnum.ICON_YELLOW
            )

        val IconGreen: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(
                icon = ImageVector.vectorResource(R.drawable.icon_green),
                color = Color(0xFF6DED57),
                enum = BreezeIconsEnum.ICON_GREEN
            )

        val IconGreenCyan: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(
                icon = ImageVector.vectorResource(R.drawable.icon_green_cyan),
                color = Color(0xFF43F89D),
                enum = BreezeIconsEnum.ICON_GREEN_CYAN
            )

        val IconTurquoise: BreezeIconsType
            @Composable
            get() = BreezeIconsType.ColorIcon(
                icon = ImageVector.vectorResource(R.drawable.icon_turquoise),
                color = Color(0xFF43F8D4),
                enum = BreezeIconsEnum.ICON_TURQUOISE
            )
    }

    object Unspecified {
        val IconUnspecified: BreezeIconsType
            get() = BreezeIconsType.Unspecified

    }




}