package navigation

sealed class Screen(val icon: String? = null, val title: String = "") {
    object Converters : Screen("images/icons/settings.svg", "Converters")
}
