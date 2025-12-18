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


        object Arrows {
            val AltArrowDown: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.alt_arrow_down),
                    enum = BreezeIconsEnum.ALT_ARROW_DOWN
                )
            val AltArrowLeft: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.alt_arrow_left),
                    enum = BreezeIconsEnum.ALT_ARROW_LEFT
                )
            val AltArrowRight: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.alt_arrow_right),
                    enum = BreezeIconsEnum.ALT_ARROW_RIGHT
                )
            val AltArrowUp: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.alt_arrow_up),
                    enum = BreezeIconsEnum.ALT_ARROW_UP
                )

            val Refresh: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.refresh),
                    enum = BreezeIconsEnum.REFRESH_LINEAR
                )

            val Restart: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.restart),
                    enum = BreezeIconsEnum.RESTART_LINEAR
                )


        }

        object Building {
            val Hospital: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.hospital),
                    enum = BreezeIconsEnum.HOSPITAL_LINEAR
                )
            val HomeLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.home), //
                    enum = BreezeIconsEnum.HOME_LINEAR
                )
        }

        object Company {
            val FacebookLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.facebook), //
                    enum = BreezeIconsEnum.FACEBOOK_LINEAR
                )
            val GoogleLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.google), //
                    enum = BreezeIconsEnum.GOOGLE_LINEAR
                )
            val GooglePlayLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.google_play), //
                    enum = BreezeIconsEnum.GOOGLE_PLAY_LINEAR
                )
            val WhatsappLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.whatsapp), //
                    enum = BreezeIconsEnum.WHATSAPP_LINEAR
                )
            val WindowsLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.windows), //
                    enum = BreezeIconsEnum.WINDOWS_LINEAR
                )
            val AndroidLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.android), //
                    enum = BreezeIconsEnum.ANDROID_LINEAR
                )
            val SpotifyLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.spotify), //
                    enum = BreezeIconsEnum.SPOTIFY_LINEAR
                )

        }
        object ContentEdit {
            val DocumentLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.document), //
                    enum = BreezeIconsEnum.DOCUMENT_LINEAR
                )
        }

        object DesignTools {
            val MagicPen: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.magicpen),
                    enum = BreezeIconsEnum.MAGIC_PEN_LINEAR
                )
        }

        object ElectronicDevices {
            val Airpods: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.airpods), //
                    enum = BreezeIconsEnum.AIRPODS_LINEAR
                )

            val Gamepad: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.gamepad),
                    enum = BreezeIconsEnum.GAMEPAD_LINEAR
                )

            val HeadphonesRound: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.headphones_round), //
                    enum = BreezeIconsEnum.HEADPHONES_ROUND_LINEAR
                )

            val Laptop: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.laptop),
                    enum = BreezeIconsEnum.LAPTOP_LINEAR
                )

        }

        object Essetional {
            val ConfettiMinimalistic: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.confetti_minimalistic),
                    enum = BreezeIconsEnum.CONFETTI_MINIMALISTIC_LINEAR
                )

            val DiscoverLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_discover),
                    enum = BreezeIconsEnum.DISCOVER_LINEAR
                )

            val InfoCircle: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.info_circle),
                    enum = BreezeIconsEnum.INFO_CIRCLE_LINEAR
                )

            val Hanger: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.hanger),
                    enum = BreezeIconsEnum.HANGER_LINEAR
                )

            val PaperBinLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.paper_bin),
                    enum = BreezeIconsEnum.PAPERBIN_LINEAR
                )

            val Skirt: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.skirt),
                    enum = BreezeIconsEnum.SKIRT_LINEAR
                )
            val Sleeping: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.sleeping),
                    enum = BreezeIconsEnum.SLEEPING_LINEAR
                )
            val TShirt: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.t_shirt),
                    enum = BreezeIconsEnum.T_SHIRT_LINEAR
                )
        }

        object Files {
            val FileText: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.file_text), //
                    enum = BreezeIconsEnum.FILE_TEXT_LINEAR
                )
        }

        object FoodKitchen {
            val ChefHat: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.chef_hat),
                enum = BreezeIconsEnum.CHEF_HAT_LINEAR
            )
            val TeaCup: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.tea_cup),
                    enum = BreezeIconsEnum.TEA_CUP_LINEAR
                )
        }

        object Delivery {
            val GroupLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_group),
                    enum = BreezeIconsEnum.GROUP_LINEAR
                )

        }

        object Location {
            val GlobeLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_global),
                    enum = BreezeIconsEnum.GLOBE_LINEAR
                )
        }

        object Like {
            val Heart: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.heart),
                    enum = BreezeIconsEnum.HEART_LINEAR
                )
        }

        object SupportLikeQuestion {
            val LikeLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    icon = ImageVector.vectorResource(R.drawable.like),
                    enum = BreezeIconsEnum.LIKE_LINEAR
                )
        }

        object Messages {
            val ChatLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.chat__square), //
                    enum = BreezeIconsEnum.CHAT_SQUARE_LINEAR
                )
            val ShareLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    icon = ImageVector.vectorResource(R.drawable.forward),
                    enum = BreezeIconsEnum.FORWARD_LINEAR
                )
        }

        object Mobility {
            val CarLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_car),
                    enum = BreezeIconsEnum.CAR_LINEAR
                )

            val AirplaneLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_airplane),
                    enum = BreezeIconsEnum.AIRPLANE_LINEAR
                )
            val BusLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.bus),
                    enum = BreezeIconsEnum.BUS_LINEAR
                )
            val GasStationLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.gas_station),
                    enum = BreezeIconsEnum.GAS_STATION_LINEAR
                )
        }

        object Money {
            val DollarCircle: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.dollar_circle),
                    enum = BreezeIconsEnum.DOLLAR_CIRCLE_LINEAR
                )
            val DollarSquare: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.dollar_square_linear),
                    enum = BreezeIconsEnum.DOLLAR_SQUARE_LINEAR
                )
            val MoneyRecive: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.money_recive),
                    enum = BreezeIconsEnum.MONEY_RECEIVE_LINEAR
                )
            val MoneySend: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.money_send_linear),
                    enum = BreezeIconsEnum.MONEY_SEND_LINEAR
                )
        }

        object Nature {
            val ChristmasTree: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.christmas_tree),
                    enum = BreezeIconsEnum.CHRISTMAS_TREE
                )

            val Recycle: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.recycle),
                    enum = BreezeIconsEnum.RECYCLE_LINEAR
                )

            val Umbrella: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.umbrella),
                    enum = BreezeIconsEnum.UMBRELLA_LINEAR
                )
        }

        object Notification {
            val NotificationLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.notification),
                    enum = BreezeIconsEnum.NOTIFICATION_LINEAR
                )
            val NotificationBingLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.notification_bing),
                    enum = BreezeIconsEnum.NOTIFICATION_BING_LINEAR
                )

        }

        object School {
            val CaseRoundMinimalistic: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.case_round_minimalistic),
                    enum = BreezeIconsEnum.CASE_ROUND_MINIMALISTIC_LINEAR
                )

            val SquareAcademicCap2: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.square_academic_cap_2),
                    enum = BreezeIconsEnum.SQUARE_ACADEMIC_CAP_2_LINEAR
                )
        }

        object SchoolLearning {
            val BookLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_book),
                    enum = BreezeIconsEnum.BOOK_LINEAR
                )

        }

        object Security {
            val KeyLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_key),
                    enum = BreezeIconsEnum.KEY_LINEAR
                )
        }

        object Settings {
            val SettingsLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.settings),
                    enum = BreezeIconsEnum.SETTINGS_LINEAR
                )
        }

        object Shop {
            val Bag2: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.bag_2),
                    enum = BreezeIconsEnum.BAG2_LINEAR
                )
        }

        object Software {
            val EditLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.edit), //
                    enum = BreezeIconsEnum.EDIT_LINEAR
                )
        }

        object Time {
            val CalendarLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.calendar_linear),
                    enum = BreezeIconsEnum.CALENDAR_LINEAR
                )
        }

        object VideoAudioImage {
            val ForwardLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.forward_play),
                    enum = BreezeIconsEnum.FORWARD_PLAYER_LINEAR

                )
            val VideoCircleLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_video_circle),
                    enum = BreezeIconsEnum.VIDEO_CIRCLE_LINEAR
                )
        }

        object Weather {
            val CloudLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_cloud),
                    enum = BreezeIconsEnum.CLOUD_LINEAR
                )

            val DropLinear: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.ic_drop),
                    enum = BreezeIconsEnum.DROP_LINEAR
                )

        }

    }

    object Outlined {

        object Building {
            val Hospital: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.hospital_outlined),
                enum = BreezeIconsEnum.HOSPITAL_OUTLINED
            )
        }


        object DesignTools {
            val MagicPen: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.magicpen_outlined),
                enum = BreezeIconsEnum.MAGIC_PEN_OUTLINED
            )
        }

        object Essetional {

            val Discover: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.discover_outlined),
                    enum = BreezeIconsEnum.DISCOVERY_OUTLINED)

            val InfoCircle: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.info_circle_outlined),
                enum = BreezeIconsEnum.INFO_CIRCLE_OUTLINED
            )

            val PaperBin: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.paperbin_outlined),
                enum = BreezeIconsEnum.PAPERBIN_OUTLINED
            )

        }


        object Delivery {
            val Group: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.group_outlined),
                    enum = BreezeIconsEnum.GROUP_OUTLINED)

        }


        object Location {
            val Globe: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.globe_outlined),
                    enum = BreezeIconsEnum.GLOBE_OUTLINED
                )
        }

        object SupportLikeQuestion {
            val Like: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                icon = ImageVector.vectorResource(R.drawable.like_outlined),
                enum = BreezeIconsEnum.LIKE_OUTLINED
            )
        }

        object Money {
            val DollarCircle: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.dollar_circle_outlined),
                enum = BreezeIconsEnum.DOLLAR_CIRCLE_OUTLINED
            )
            val DollarSquare: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.dollar_square_outlined),
                enum = BreezeIconsEnum.DOLLAR_SQUARE_OUTLINED
            )
            val MoneyRecive: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.money_recive_outlined),
                enum = BreezeIconsEnum.MONEY_RECEIVE_OUTLINED
            )
            val MoneySend: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.money_send_outlined),
                enum = BreezeIconsEnum.MONEY_SEND_OUTLINED
            )
        }

        object Notification {
            val Notification: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.notification_outlined),
                enum = BreezeIconsEnum.NOTIFICATION_OUTLINED
            )
            val NotificationBing: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.notification_bing_outlined),
                enum = BreezeIconsEnum.NOTIFICATION_BING_OUTLINED
            )

        }

        object SchoolLearning {
            val Book: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.book_outlined),
                    enum = BreezeIconsEnum.BOOK_OUTLINED)

        }

        object Security {
            val Key: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.key_outlined),
                    enum = BreezeIconsEnum.KEY_OUTLINED)
        }

        object Settings {
            val Settings: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.settings_outlined),
                enum = BreezeIconsEnum.SETTINGS_OUTLINED
            )
        }

        object Shop {
            val Bag: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.bag_outlined),
                enum = BreezeIconsEnum.BAG_OUTLINED
            )
        }

        object Time {
            val Calendar: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.calendar_outlined),
                enum = BreezeIconsEnum.CALENDAR_OUTLINED
            )
        }

        object VideoAudioImage {
            val ForwardLinear: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.forward_outlined),
                enum = BreezeIconsEnum.FORWARD_OUTLINED

            )
            val VideoCircle: BreezeIconsType
            @Composable
            get() = BreezeIconsType.NormalIcon(
                ImageVector.vectorResource(R.drawable.play_circle_outlined),
                enum = BreezeIconsEnum.PLAY_CIRCLE_OUTLINED
            )
        }

        object Weather {
            val Cloud: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.cloud_outlined),
                    enum = BreezeIconsEnum.CLOUD_OUTLINED)

            val Drop: BreezeIconsType
                @Composable
                get() = BreezeIconsType.NormalIcon(
                    ImageVector.vectorResource(R.drawable.drop_outlined),
                    enum = BreezeIconsEnum.DROP_OUTLINED
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