package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Primary,
    primaryVariant = PrimaryDark,
    background = DarkPrimary,
    surface = DarkPrimaryLight,
    onPrimary = PrimaryAccent,
    onBackground = DarkPrimaryAccent,
    onSurface = DarkPrimaryAccent,
    error = Danger,
    onError = White,
)

private val LightColorPalette = lightColors(
    primary = Primary,
    primaryVariant = PrimaryDark,
    background = White,
    surface = PrimaryLight,
    onPrimary = PrimaryAccent,
    onBackground = DarkPrimaryDark,
    onSurface = DarkPrimary,
    error = Danger,
    onError = White,
)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
