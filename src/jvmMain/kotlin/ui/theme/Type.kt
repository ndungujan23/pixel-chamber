package ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val fontPath: (String) -> String = { "fonts/sailec/${it}" }
private val Sailec = FontFamily(
    Font(fontPath("sailec_regular.otf")),
    Font(fontPath("sailec_medium.otf"), FontWeight.W500),
    Font(fontPath("sailec_bold.otf"), FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h4 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W600,
        fontSize = 34.sp
    ),
    h5 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Sailec,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    button = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )
)
