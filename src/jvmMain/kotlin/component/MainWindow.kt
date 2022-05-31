package component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

@Composable
fun MainWindow(
    launched: Boolean = false,
    title: String = "Gedhafu Pixel Chamber",
    onCloseRequest: () -> Unit,
    content: @Composable FrameWindowScope.() -> Unit
) {
    when {
        launched -> Window(
            onCloseRequest = onCloseRequest,
            title = title,
            state = rememberWindowState(
                placement = WindowPlacement.Maximized,
                position = WindowPosition(Alignment.Center)
            ),
            content = content,
        )
        else -> Window(
            onCloseRequest = onCloseRequest,
            title = title,
            state = rememberWindowState(
                width = 600.dp,
                height = 400.dp,
                placement = WindowPlacement.Floating,
                position = WindowPosition(Alignment.Center)
            ),
            resizable = false,
            undecorated = true,
            content = content,
        )
    }
}
