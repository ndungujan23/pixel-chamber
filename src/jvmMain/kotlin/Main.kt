import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import component.LaunchBox
import component.MainWindow
import kotlinx.coroutines.delay
import ui.theme.AppTheme

@ExperimentalFoundationApi
@ExperimentalMaterialApi
fun main() = application {
    val title = "Gedhafu Pixel Chamber"
    var launched by remember { mutableStateOf(false) }

    val onCloseRequest: () -> Unit = ::exitApplication

    LaunchedEffect(1) {
        delay(3000)
        launched = true
    }

    MainWindow(launched, title, onCloseRequest) {
        AppTheme {
            when {
                launched -> MainApp()
                else -> LaunchBox()
            }
        }
    }
}

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun MainApp() {
    val scaffoldState = rememberScaffoldState()
//    var selectedScreen by remember { mutableStateOf<Screen>(Screen.Converters) }

    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            TopAppBar(
                elevation = 0.dp,
                title = {
                    Icon(
                        painterResource("images/logo.png"),
                        "App logo",
                        modifier = Modifier.size(30.dp),
                    )
                },
            )
        },
        bottomBar = {
//            BottomBar(
//                items = items,
//                selectedItemIndex = items.indexOf(selectedScreen),
//                onItemSelected = { item -> selectedScreen = item }
//            )
        }
    ) {
//        when (selectedScreen) {
//            is Screen.Converters -> ConvertersView()
//            is Screen.Colors -> ColorsView()
//            is Screen.Videos -> VideosView()
//            is Screen.Images -> ImagesView()
//            is Screen.Fonts -> FontsView()
//        }
    }
}


