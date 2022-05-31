package component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import navigation.Screen


@Composable
fun BottomBar(
    items: List<Screen> = emptyList(),
    selectedItemIndex: Int = 0,
    onItemSelected: (Screen) -> Unit,
) {
    BottomAppBar(elevation = 10.dp) {
        items.forEachIndexed { index, screen ->
            BottomNavigationItem(
                icon = {
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painter = painterResource(screen.icon.orEmpty()),
                            "Navigation Icon",
                            modifier = Modifier.size(24.dp).padding(bottom = 4.dp),
                        )
                        Text(screen.title, style = MaterialTheme.typography.caption,)
                    }
                },
                onClick = { onItemSelected.invoke(screen) },
                selected = selectedItemIndex == index
            )
        }
    }
}
