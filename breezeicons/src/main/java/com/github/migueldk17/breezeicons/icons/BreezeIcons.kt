@file:Suppress("unused")

package com.github.migueldk17.breezeicons.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.github.migueldk17.breezeicons.R

/**
 * Contains icons from the BreezeIcons Library.
 *
 * Organized into different styles, such as ´Linear´ and ´Colors´
 */
object BreezeIcons {

    /**
     * Icons with thin and consistent lines (Linear style).
     *
     * Ideals for minimalists and modern interfaces, where visual lightness is priority
     */
    object Linear {

        object Building {
            val Hospital: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.hospital),
                enum = BreezeIconsEnum.HOSPITAL_LINEAR
            )
            val HomeLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.home),
                enum = BreezeIconsEnum.HOME_LINEAR
            )
        }

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
            val GooglePlayLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.google_play),
                enum = BreezeIconsEnum.GOOGLE_PLAY_LINEAR
            )
            val WhatsappLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.whatsapp),
                enum = BreezeIconsEnum.WHATSAPP_LINEAR
            )
            val WindowsLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.windows),
                enum = BreezeIconsEnum.WINDOWS_LINEAR
            )
            val AndroidLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.android),
                enum = BreezeIconsEnum.ANDROID_LINEAR
            )
            val SpotifyLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.spotify),
                enum = BreezeIconsEnum.SPOTIFY_LINEAR
            )

        }
        object ContentEdit {
            val DocumentLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.document),
                enum = BreezeIconsEnum.DOCUMENT_LINEAR
            )
        }

        object DesignTools {
            val MagicPen: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.magicpen),
                enum = BreezeIconsEnum.MAGIC_PEN_LINEAR
            )
        }

        object ElectronicDevices {
            val Airpods: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.airpods),
                enum = BreezeIconsEnum.AIRPODS_LINEAR
            )
            val HeadphonesRound: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.headphones_round),
                enum = BreezeIconsEnum.HEADPHONES_ROUND_LINEAR
            )
        }

        object Essetional {
            val DiscoverLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.LinearIcon(
                    ImageVector.vectorResource(R.drawable.ic_discover),
                    enum = BreezeIconsEnum.DISCOVER_LINEAR)

            val InfoCircle: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.info_circle),
                enum = BreezeIconsEnum.INFO_CIRCLE_LINEAR
            )

            val PaperBinLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.paper_bin),
                enum = BreezeIconsEnum.PAPERBIN_LINEAR
            )

        }

        object Files {
            val FileText: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.file_text),
                enum = BreezeIconsEnum.FILE_TEXT_LINEAR
            )
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

        object Like {
            val LikeLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                icon = ImageVector.vectorResource(R.drawable.like),
                enum = BreezeIconsEnum.LIKE_LINEAR
            )
        }

        object Messages {
            val ChatLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.chat__square),
                enum = BreezeIconsEnum.CHAT_SQUARE_LINEAR
            )
            val ShareLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                icon = ImageVector.vectorResource(R.drawable.forward),
                enum = BreezeIconsEnum.FORWARD_LINEAR
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
            val GasStationLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.gas_station),
                enum = BreezeIconsEnum.GAS_STATION_LINEAR
            )
        }

        object Money {
            val DollarCircle: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.dollar_circle),
                enum = BreezeIconsEnum.DOLLAR_CIRCLE
            )
            val DollarSquare: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.dollar),
                enum = BreezeIconsEnum.DOLLAR_SQUARE
            )
            val MoneyRecive: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.money_recive),
                enum = BreezeIconsEnum.MONEY_RECIVE
            )
            val MoneySend: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.money_send),
                enum = BreezeIconsEnum.MONEY_SEND
            )
        }

        object Notification {
            val NotificationLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.notification),
                enum = BreezeIconsEnum.NOTIFICATION_LINEAR
            )
            val NotificationBingLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.notification_bing),
                enum = BreezeIconsEnum.NOTIFICATION_BING_LINEAR
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

        object Settings {
            val SettingsLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.settings),
                enum = BreezeIconsEnum.SETTINGS_LINEAR
            )
        }

        object Shop {
            val Bag2: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.bag_2),
                enum = BreezeIconsEnum.BAG2_LINEAR
            )
        }

        object Software {
            val EditLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.edit),
                enum = BreezeIconsEnum.EDIT_LINEAR
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

        object VideoAudioImage {
            val ForwardLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.forward_play),
                enum = BreezeIconsEnum.FORWARD_PLAYER_LINEAR

            )
            val VideoCircleLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.LinearIcon(
                ImageVector.vectorResource(R.drawable.ic_video_circle),
                enum = BreezeIconsEnum.VIDEO_CIRCLE_LINEAR
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

    /**
     * Visual icons representing solid colors
     *
     * These icons are used as color samples in theme selectors, palettes, or UI customization.
     * They do not represent actions, they just indicate the selected color
     */
    object Colors {

        object Vibrant {
            val IconOrange: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_orange),
                    color = Color(0xFFF8C543),
                    enum = BreezeIconsEnum.ICON_ORANGE_VIBRANT
                )

            val IconYellow: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_yellow),
                    color = Color(0xFFF5F843),
                    enum = BreezeIconsEnum.ICON_YELLOW_VIBRANT
                )

            val IconGreen: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_green),
                    color = Color(0xFF6DED57),
                    enum = BreezeIconsEnum.ICON_GREEN_VIBRANT
                )

            val IconGreenCyan: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_green_cyan),
                    color = Color(0xFF43F89D),
                    enum = BreezeIconsEnum.ICON_GREEN_CYAN_VIBRANT
                )

            val IconTurquoise: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_turquoise),
                    color = Color(0xFF43F8D4),
                    enum = BreezeIconsEnum.ICON_TURQUOISE_VIBRANT
                )
            val IconBlue: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_blue),
                    color = Color(0xFF3498DB),
                    enum = BreezeIconsEnum.ICON_BLUE_VIBRANT
                )

            val IconPurple: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_purple),
                    color = Color(0xFF9B59B6),
                    enum = BreezeIconsEnum.ICON_PURPLE_VIBRANT
                )

            val IconRed: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_red),
                    color = Color(0xFFE74C3C),
                    enum = BreezeIconsEnum.ICON_RED_VIBRANT
                )

            val RoyalBlue: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_blue_royal),
                    color = Color(0xFF1565C0),
                    enum = BreezeIconsEnum.ICON_BLUE_ROYAL_VIBRANT
                )

            val IconPink: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_pink),
                    color = Color(0xFFD81B60),
                    enum = BreezeIconsEnum.ICON_PINK_VIBRANT
                )

            val IconMagenta: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.icon_magenta),
                    color = Color(0xFFC2185B),
                    enum = BreezeIconsEnum.ICON_MAGENTA_VIBRANT
                )
        }
        object Soft{
            val SoftOrange: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_orange),
                    color = Color(0xFFFFE0B2),
                    enum = BreezeIconsEnum.ICON_SOFT_ORANGE
                )

            val SoftYellow: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_yellow),
                    color = Color(0xFFFFF9C4),
                    enum = BreezeIconsEnum.ICON_SOFT_YELLOW
                )

            val SoftGreen: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_green),
                    color = Color(0xFFE8F5E9),
                    enum = BreezeIconsEnum.ICON_SOFT_GREEN
                )

            val SoftGreenCyan: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_green_cyan),
                    color = Color(0xFFE0F2F1),
                    enum = BreezeIconsEnum.ICON_SOFT_GREEN_CYAN
                )

            val SoftCyan: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_cyan),
                    color = Color(0xFFE0F7FA),
                    enum = BreezeIconsEnum.ICON_SOFT_CYAN
                )

            val SoftBlue: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_blue),
                    color = Color(0xFFE3F2FD),
                    enum = BreezeIconsEnum.ICON_SOFT_BLUE
                )

            val SoftRoyalBlue: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_royal_blue),
                    color = Color(0xFFD0E1F9),
                    enum = BreezeIconsEnum.ICON_SOFT_ROYAL_BLUE
                )

            val SoftPurple: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_purple),
                    color = Color(0xFFF3E5F5),
                    enum = BreezeIconsEnum.ICON_SOFT_PURPLE
                )

            val SoftRed: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_red),
                    color = Color(0xFFFFEBEE),
                    enum = BreezeIconsEnum.ICON_SOFT_RED
                )

            val SoftPink: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_pink),
                    color = Color(0xFFFCE4EC),
                    enum = BreezeIconsEnum.ICON_SOFT_PINK
                )

            val SoftMagenta: BreezeIconsType
                @Composable
                get() = BreezeIconsType.ColorIcon(
                    icon = ImageVector.vectorResource(R.drawable.soft_magenta),
                    color = Color(0xFFF8BBD0),
                    enum = BreezeIconsEnum.ICON_SOFT_MAGENTA
                )


        }
    }

    /**
     * Object reserved for internal use such typing placeholder.
     *
     * This does not represent a visual icon and **will not be rendered in the UI**.
     * Useful as a default or fallback value.
     */
    object Unspecified {
        val IconUnspecified: BreezeIconsType
            get() = BreezeIconsType.Unspecified

    }




}