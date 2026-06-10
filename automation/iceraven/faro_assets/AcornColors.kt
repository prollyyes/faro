/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

@file:Suppress("MagicNumber")

package mozilla.components.compose.base.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import mozilla.components.ui.colors.PhotonColors

/**
 * A custom Color Palette for Mozilla Firefox for Android (Fenix).
 */
@Suppress("LongParameterList")
@Stable
class AcornColors(
    layer2: Color,
    layer3: Color,
    layerAccent: Color,
    layerAccentNonOpaque: Color,
    layerGradientStart: Color,
    layerGradientEnd: Color,
    layerWarning: Color,
    layerCritical: Color,
    layerInformation: Color,
    actionWarning: Color,
    actionCritical: Color,
    actionInformation: Color,
    formDefault: Color,
    textOnColorPrimary: Color,
    iconPrimaryInactive: Color,
    iconOnColor: Color,
    ripple: Color,
    tabActive: Color,
    tabInactive: Color,
    information: Color,
    informationContainer: Color,
    onInformationContainer: Color,
    success: Color,
    warning: Color,
    warningContainer: Color,
    onWarningContainer: Color,
    surfaceDimVariant: Color,
) {
    // Layers

    // Card background, Menu background, Dialog, Banner
    var layer2 by mutableStateOf(layer2)
        private set

    // Search
    var layer3 by mutableStateOf(layer3)
        private set

    // App Bar Top (edit), Text Cursor, Selected Tab Check
    var layerAccent by mutableStateOf(layerAccent)
        private set

    // Selected tab
    var layerAccentNonOpaque by mutableStateOf(layerAccentNonOpaque)
        private set

    // Tooltip
    var layerGradientStart by mutableStateOf(layerGradientStart)
        private set

    // Tooltip
    var layerGradientEnd by mutableStateOf(layerGradientEnd)
        private set

    // Warning background
    var layerWarning by mutableStateOf(layerWarning)
        private set

    // Error Background
    var layerCritical by mutableStateOf(layerCritical)
        private set

    // Info background
    var layerInformation by mutableStateOf(layerInformation)
        private set

    // Actions

    // Warning button
    var actionWarning by mutableStateOf(actionWarning)
        private set

    // Error button
    var actionCritical by mutableStateOf(actionCritical)
        private set

    // Info button
    var actionInformation by mutableStateOf(actionInformation)
        private set

    // Checkbox default, Radio button default
    var formDefault by mutableStateOf(formDefault)
        private set

    // Text

    // Text Inverted/On Color
    var textOnColorPrimary by mutableStateOf(textOnColorPrimary)
        private set

    // Icon

    // Inactive tab
    var iconPrimaryInactive by mutableStateOf(iconPrimaryInactive)
        private set

    // Icon inverted (on color)
    var iconOnColor by mutableStateOf(iconOnColor)
        private set

    var ripple by mutableStateOf(ripple)
        private set

    // Tab Active
    var tabActive by mutableStateOf(tabActive)
        private set

    // Tab Inactive
    var tabInactive by mutableStateOf(tabInactive)
        private set

    /*
     * M3 color scheme extensions that do not have a mapped value from Acorn
     */

    /**
     * Attention-grabbing color against surface for fills, icons, and text,
     * indicating neutral information.
     */
    internal var information by mutableStateOf(information)
        private set

    /**
     * Less prominent fill color against surface, for neutral information.
     */
    internal var informationContainer by mutableStateOf(informationContainer)
        private set

    /**
     * Text and icons against information container.
     */
    internal var onInformationContainer by mutableStateOf(onInformationContainer)
        private set

    /**
     * Attention-grabbing color against surface for fills, icons, and text,
     * indicating successful information
     */
    internal var success by mutableStateOf(success)
        private set

    /**
     * Attention-grabbing color against surface for fills, icons, and text, indicating
     * warning information.
     */
    internal var warning by mutableStateOf(warning)
        private set

    /**
     * Less prominent fill color against surface, for warning information.
     */
    internal var warningContainer by mutableStateOf(warningContainer)
        private set

    /**
     * Text and icons against warning container.
     */
    internal var onWarningContainer by mutableStateOf(onWarningContainer)
        private set

    /**
     * Slightly dimmer surface color in light theme.
     */
    internal var surfaceDimVariant by mutableStateOf(surfaceDimVariant)
        private set

    /**
     * Updates the existing colors with the provided [AcornColors].
     */
    @Suppress("LongMethod")
    fun update(other: AcornColors) {
        layer2 = other.layer2
        layer3 = other.layer3
        layerAccent = other.layerAccent
        layerAccentNonOpaque = other.layerAccentNonOpaque
        layerGradientStart = other.layerGradientStart
        layerGradientEnd = other.layerGradientEnd
        layerWarning = other.layerWarning
        layerCritical = other.layerCritical
        layerInformation = other.layerInformation
        actionWarning = other.actionWarning
        actionCritical = other.actionCritical
        actionInformation = other.actionInformation
        formDefault = other.formDefault
        textOnColorPrimary = other.textOnColorPrimary
        iconPrimaryInactive = other.iconPrimaryInactive
        iconOnColor = other.iconOnColor
        ripple = other.ripple
        tabActive = other.tabActive
        tabInactive = other.tabInactive
        information = other.information
        informationContainer = other.informationContainer
        onInformationContainer = other.onInformationContainer
        success = other.success
        warning = other.warning
        warningContainer = other.warningContainer
        onWarningContainer = other.onWarningContainer
        surfaceDimVariant = other.surfaceDimVariant
    }

    /**
     * Return a copy of this [AcornColors] and optionally overriding any of the provided values.
     */
    @Suppress("LongMethod")
    fun copy(
        layer2: Color = this.layer2,
        layer3: Color = this.layer3,
        layerAccent: Color = this.layerAccent,
        layerAccentNonOpaque: Color = this.layerAccentNonOpaque,
        layerGradientStart: Color = this.layerGradientStart,
        layerGradientEnd: Color = this.layerGradientEnd,
        layerWarning: Color = this.layerWarning,
        layerCritical: Color = this.layerCritical,
        layerInformation: Color = this.layerInformation,
        actionWarning: Color = this.actionWarning,
        actionCritical: Color = this.actionCritical,
        actionInformation: Color = this.actionInformation,
        formDefault: Color = this.formDefault,
        textOnColorPrimary: Color = this.textOnColorPrimary,
        iconPrimaryInactive: Color = this.iconPrimaryInactive,
        iconOnColor: Color = this.iconOnColor,
        ripple: Color = this.ripple,
        tabActive: Color = this.tabActive,
        tabInactive: Color = this.tabInactive,
        information: Color = this.information,
        informationContainer: Color = this.informationContainer,
        onInformationContainer: Color = this.onInformationContainer,
        success: Color = this.success,
        warning: Color = this.warning,
        warningContainer: Color = this.warningContainer,
        onWarningContainer: Color = this.onWarningContainer,
        surfaceDimVariant: Color = this.surfaceDimVariant,
    ): AcornColors = AcornColors(
        layer2 = layer2,
        layer3 = layer3,
        layerAccent = layerAccent,
        layerAccentNonOpaque = layerAccentNonOpaque,
        layerGradientStart = layerGradientStart,
        layerGradientEnd = layerGradientEnd,
        layerWarning = layerWarning,
        layerCritical = layerCritical,
        layerInformation = layerInformation,
        actionWarning = actionWarning,
        actionCritical = actionCritical,
        actionInformation = actionInformation,
        formDefault = formDefault,
        textOnColorPrimary = textOnColorPrimary,
        iconPrimaryInactive = iconPrimaryInactive,
        iconOnColor = iconOnColor,
        ripple = ripple,
        tabActive = tabActive,
        tabInactive = tabInactive,
        information = information,
        informationContainer = informationContainer,
        onInformationContainer = onInformationContainer,
        success = success,
        warning = warning,
        warningContainer = warningContainer,
        onWarningContainer = onWarningContainer,
        surfaceDimVariant = surfaceDimVariant,
    )
}


// ── Faro Design System — Mediterranean palette ───────────────────────────────
// Light: warm sand (#FBF7F0) · ink (#261F18) · Azure Coast (#1B86B8)
// Dark:  Mediterranean night (#131110) · warm cream (#F4EDE2) · azure (#4FB4DC)
private object FaroColors {
    val sand50   = Color(0xFFFBF7F0)
    val sand100  = Color(0xFFF5EEE2)
    val sand200  = Color(0xFFEBE0CF)
    val sand300  = Color(0xFFDCCDB6)
    val stone400 = Color(0xFFB6A892)
    val stone500 = Color(0xFF8B7E6C)
    val stone600 = Color(0xFF6B6052)
    val ink800   = Color(0xFF3A332B)
    val ink900   = Color(0xFF261F18)
    val darkBg            = Color(0xFF131110)
    val darkSurface       = Color(0xFF1A1714)
    val darkSurfaceHigh   = Color(0xFF222018)
    val darkSurfaceHighest= Color(0xFF2A2520)
    val darkText          = Color(0xFFF4EDE2)
    val darkTextSoft      = Color(0xFFC3B6A4)
    val darkTextFaint     = Color(0xFF9A8E7E)
    val azure300          = Color(0xFF7FC9E3)
    val azure500          = Color(0xFF1B86B8)
    val azure600          = Color(0xFF15709C)
    val azureDark         = Color(0xFF4FB4DC)
    val azureContainer    = Color(0xFFD4EEF8)
    val azureContainerDark= Color(0xFF0E2A38)
    val azureNonOpaque    = Color(0x221B86B8)
    val azureDarkNonOpaque= Color(0x524FB4DC)
    val scrim             = Color(0xC7140C08)
}

val darkColorPalette = AcornColors(
    layer2 = FaroColors.darkSurfaceHigh,
    layer3 = FaroColors.darkBg,
    layerAccent = FaroColors.azureDark,
    layerAccentNonOpaque = FaroColors.azureDarkNonOpaque,
    layerGradientStart = FaroColors.azureDark,
    layerGradientEnd = FaroColors.azure600,
    layerWarning = PhotonColors.Yellow70A77,
    layerCritical = PhotonColors.Pink80,
    layerInformation = FaroColors.azureDark,
    actionWarning = PhotonColors.Yellow40A41,
    actionCritical = PhotonColors.Pink70A69,
    actionInformation = FaroColors.azure600,
    formDefault = FaroColors.darkText,
    textOnColorPrimary = FaroColors.darkText,
    iconPrimaryInactive = Color(0x99F4EDE2),
    iconOnColor = FaroColors.darkBg,
    ripple = FaroColors.darkText,
    tabActive = FaroColors.darkSurface,
    tabInactive = FaroColors.darkBg,
    information = FaroColors.azure300,
    informationContainer = FaroColors.azureContainerDark,
    onInformationContainer = FaroColors.darkText,
    success = PhotonColors.Green50,
    warning = PhotonColors.Yellow50,
    warningContainer = PhotonColors.Yellow70A77,
    onWarningContainer = FaroColors.darkText,
    surfaceDimVariant = FaroColors.darkBg,
)

val lightColorPalette = AcornColors(
    layer2 = FaroColors.sand100,
    layer3 = FaroColors.sand200,
    layerAccent = FaroColors.azure500,
    layerAccentNonOpaque = FaroColors.azureNonOpaque,
    layerGradientStart = FaroColors.azure500,
    layerGradientEnd = FaroColors.azure600,
    layerWarning = PhotonColors.Yellow20,
    layerCritical = PhotonColors.Red10,
    layerInformation = FaroColors.azure500,
    actionWarning = PhotonColors.Yellow60A40,
    actionCritical = PhotonColors.Red30,
    actionInformation = FaroColors.azure500,
    formDefault = FaroColors.ink900,
    textOnColorPrimary = Color(0xFFFFFFFF),
    iconPrimaryInactive = Color(0x99261F18),
    iconOnColor = Color(0xFFFFFFFF),
    ripple = FaroColors.ink900,
    tabActive = FaroColors.sand50,
    tabInactive = FaroColors.sand100,
    information = FaroColors.azure600,
    informationContainer = FaroColors.azureContainer,
    onInformationContainer = FaroColors.ink900,
    success = PhotonColors.Green80,
    warning = PhotonColors.Yellow80,
    warningContainer = PhotonColors.Yellow20,
    onWarningContainer = FaroColors.ink900,
    surfaceDimVariant = FaroColors.sand200,
)

val privateColorPalette = darkColorPalette.copy(
    layer2 = PhotonColors.Violet90,
    layer3 = PhotonColors.Ink90,
    tabActive = PhotonColors.Purple60,
    tabInactive = PhotonColors.Ink90,
    surfaceDimVariant = PhotonColors.Ink90,
)

@Suppress("LongParameterList")
private fun buildColorScheme(
    primary: Color,
    primaryContainer: Color,
    inversePrimary: Color,
    secondary: Color,
    secondaryContainer: Color,
    tertiary: Color,
    tertiaryContainer: Color,
    surface: Color,
    onSurface: Color,
    surfaceTint: Color,
    inverseSurface: Color,
    inverseOnSurface: Color,
    error: Color,
    errorContainer: Color,
    outline: Color,
    outlineVariant: Color,
    scrim: Color,
    surfaceBright: Color,
    surfaceDim: Color,
    surfaceContainer: Color,
    surfaceContainerHigh: Color,
    surfaceContainerHighest: Color,
    surfaceContainerLow: Color,
    surfaceContainerLowest: Color,
): ColorScheme = ColorScheme(
    primary = primary,
    onPrimary = inverseOnSurface,
    primaryContainer = primaryContainer,
    onPrimaryContainer = onSurface,
    inversePrimary = inversePrimary,
    secondary = secondary,
    onSecondary = inverseOnSurface,
    secondaryContainer = secondaryContainer,
    onSecondaryContainer = onSurface,
    tertiary = tertiary,
    onTertiary = inverseOnSurface,
    tertiaryContainer = tertiaryContainer,
    onTertiaryContainer = onSurface,
    background = surface,
    onBackground = onSurface,
    surface = surface,
    onSurface = onSurface,
    surfaceVariant = surfaceContainerHighest,
    onSurfaceVariant = secondary,
    surfaceTint = surfaceTint,
    inverseSurface = inverseSurface,
    inverseOnSurface = inverseOnSurface,
    error = error,
    onError = inverseOnSurface,
    errorContainer = errorContainer,
    onErrorContainer = onSurface,
    outline = outline,
    outlineVariant = outlineVariant,
    scrim = scrim,
    surfaceBright = surfaceBright,
    surfaceDim = surfaceDim,
    surfaceContainer = surfaceContainer,
    surfaceContainerHigh = surfaceContainerHigh,
    surfaceContainerHighest = surfaceContainerHighest,
    surfaceContainerLow = surfaceContainerLow,
    surfaceContainerLowest = surfaceContainerLowest,
    primaryFixed = PhotonColors.Violet05,
    primaryFixedDim = primaryContainer,
    onPrimaryFixed = PhotonColors.DarkGrey90,
    onPrimaryFixedVariant = inverseOnSurface,
    secondaryFixed = secondaryContainer,
    secondaryFixedDim = secondaryContainer,
    onSecondaryFixed = onSurface,
    onSecondaryFixedVariant = inverseOnSurface,
    tertiaryFixed = tertiaryContainer,
    tertiaryFixedDim = tertiaryContainer,
    onTertiaryFixed = onSurface,
    onTertiaryFixedVariant = inverseOnSurface,
)

/**
 * Returns a dark Material color scheme — Faro Mediterranean night.
 */
fun acornDarkColorScheme(): ColorScheme = buildColorScheme(
    primary = FaroColors.azureDark,
    primaryContainer = FaroColors.azureContainerDark,
    inversePrimary = FaroColors.azure500,
    secondary = FaroColors.darkTextSoft,
    secondaryContainer = FaroColors.darkSurfaceHighest,
    tertiary = FaroColors.azure300,
    tertiaryContainer = FaroColors.azureContainerDark,
    surface = FaroColors.darkBg,
    onSurface = FaroColors.darkText,
    surfaceTint = Color(0x57C3B6A4),
    inverseSurface = FaroColors.sand100,
    inverseOnSurface = FaroColors.darkSurface,
    error = PhotonColors.Red20,
    errorContainer = PhotonColors.Red80,
    outline = FaroColors.darkTextFaint,
    outlineVariant = FaroColors.darkSurfaceHighest,
    scrim = FaroColors.scrim,
    surfaceBright = FaroColors.darkSurfaceHighest,
    surfaceDim = FaroColors.darkBg,
    surfaceContainer = FaroColors.darkSurface,
    surfaceContainerHigh = FaroColors.darkSurfaceHigh,
    surfaceContainerHighest = FaroColors.darkSurfaceHighest,
    surfaceContainerLow = FaroColors.darkBg,
    surfaceContainerLowest = FaroColors.darkBg,
)

/**
 * Returns a light Material color scheme — Faro Azure Coast.
 */
fun acornLightColorScheme(): ColorScheme = buildColorScheme(
    primary = FaroColors.azure500,
    primaryContainer = FaroColors.azureContainer,
    inversePrimary = FaroColors.azureDark,
    secondary = FaroColors.stone600,
    secondaryContainer = FaroColors.sand200,
    tertiary = FaroColors.azure600,
    tertiaryContainer = FaroColors.azureContainer,
    surface = FaroColors.sand50,
    onSurface = FaroColors.ink900,
    surfaceTint = Color(0x6E6B6052),
    inverseSurface = FaroColors.ink800,
    inverseOnSurface = FaroColors.sand50,
    error = PhotonColors.Red70,
    errorContainer = PhotonColors.Red10,
    outline = FaroColors.stone400,
    outlineVariant = FaroColors.sand300,
    scrim = FaroColors.scrim,
    surfaceBright = FaroColors.sand50,
    surfaceDim = FaroColors.sand200,
    surfaceContainer = FaroColors.sand100,
    surfaceContainerHigh = FaroColors.sand200,
    surfaceContainerHighest = FaroColors.sand300,
    surfaceContainerLow = FaroColors.sand100,
    surfaceContainerLowest = FaroColors.sand50,
)

/**
 * Returns a private Material color scheme mapped from Acorn.
 */
fun acornPrivateColorScheme(): ColorScheme = buildColorScheme(
    primary = PhotonColors.Violet10,
    primaryContainer = PhotonColors.Violet80,
    inversePrimary = PhotonColors.Violet70,
    secondary = PhotonColors.LightGrey40,
    secondaryContainer = Color(0xFF4B3974),
    tertiary = PhotonColors.Violet20,
    tertiaryContainer = PhotonColors.Pink80,
    surface = Color(0xFF342B4A),
    onSurface = PhotonColors.LightGrey05,
    surfaceTint = PhotonColors.Violet60,
    inverseSurface = PhotonColors.LightGrey40,
    inverseOnSurface = PhotonColors.DarkGrey90,
    error = PhotonColors.Red20,
    errorContainer = PhotonColors.Red80,
    outline = PhotonColors.LightGrey80,
    outlineVariant = PhotonColors.DarkGrey05,
    scrim = PhotonColors.DarkGrey90A95,
    surfaceBright = Color(0xFF413857),
    surfaceDim = PhotonColors.Ink90,
    surfaceContainer = Color(0xFF342B4A),
    surfaceContainerHigh = Color(0xFF3B3251),
    surfaceContainerHighest = Color(0xFF413857),
    surfaceContainerLow = Color(0xFF281C3D),
    surfaceContainerLowest = PhotonColors.Ink90,
)

// M3 color scheme extensions

/**
 * @see AcornColors.information
 */
val ColorScheme.information: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.information

/**
 * @see AcornColors.informationContainer
 */
val ColorScheme.informationContainer: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.informationContainer

/**
 * @see AcornColors.onInformationContainer
 */
val ColorScheme.onInformationContainer: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.onInformationContainer

/**
 * @see AcornColors.success
 */
val ColorScheme.success: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.success

/**
 * @see AcornColors.warning
 */
val ColorScheme.warning: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.warning

/**
 * @see AcornColors.warningContainer
 */
val ColorScheme.warningContainer: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.warningContainer

/**
 * @see AcornColors.onWarningContainer
 */
val ColorScheme.onWarningContainer: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.onWarningContainer

/**
 * @see AcornColors.surfaceDimVariant
 */
val ColorScheme.surfaceDimVariant: Color
    @Composable
    @ReadOnlyComposable
    get() = AcornTheme.colors.surfaceDimVariant
