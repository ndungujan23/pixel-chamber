package component

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LaunchBox() {
    Box(Modifier.fillMaxSize().background(MaterialTheme.colors.background)) {
        Image(
            painter = painterResource("images/launcher.jpg"),
            contentDescription = "launcher wallpaper",
            modifier = Modifier.fillMaxSize(),
            alignment = Alignment.Center,
            contentScale = ContentScale.FillBounds,
            alpha = DefaultAlpha,
        )
        Column(Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.15f))) {}
        Image(
            painter = painterResource("images/logo.png"),
            contentDescription = "App Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.align(Alignment.Center),
        )
        Row(
            modifier = Modifier.height(12.dp).fillMaxWidth().align(Alignment.BottomCenter).background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
        }
    }
}
