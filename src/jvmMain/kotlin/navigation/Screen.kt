package navigation

sealed class Screen(val icon: String? = null, val title: String = "") {
    object AndroidLauncher : Screen("images/icons/android_black.svg", "Android Launcher")
    object FaviconGenerator : Screen("images/icons/image_black.svg", "Favicon")
    object Converters : Screen("images/icons/settings_black.svg", "Converter")
}
