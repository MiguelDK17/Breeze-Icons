package com.github.migueldk17.breezeicons.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Sealed base class used for representing and typing the icons from BreezeIcons Library
 *
 * This class encapsulates both linear icons and colored icons in addition to an unspecified value used as a fallback or placeholder
 *
 * @property enum Enum that logically identifies the icon.
 * @property color Color associated with the icon, when applicable.
 */
sealed class BreezeIconsType(val enum: BreezeIconsEnum = BreezeIconsEnum.ICON_UNSPECIFIED, open val color: Color = Color.Unspecified) {
    /**
     * Representing a colored icon.
     *
     * Mainly used to display color options in the interface (e.g. theme selectors).
     *
     * @property icon Icon that will be rendered.
     * @property color Solid color that the icon represents
     * @property enum Associated enum for logical identification.
     */
     internal class ColorIcon(val icon: ImageVector, override val color: Color, enum: BreezeIconsEnum): BreezeIconsType(enum)

    /**
     * Representing a linear icon(with fine and consistent lines)
     *
     * Ideal for minimalist and moderns UI
     *
     * @property icon Icon that will be rendered.
     * @property enum Associated enum for logical identification.
     */
     internal class NormalIcon(val icon: ImageVector, enum: BreezeIconsEnum): BreezeIconsType(enum)

    /**
     * Represents an unspecified icon state.
     *
     * Used only for typing and **will not be rendered in the interface**.
     */
    data object Unspecified : BreezeIconsType()
}