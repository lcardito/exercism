import java.lang.String.format

fun twofer(name: String? = null): String {
    return format("One for %s, one for me.", name ?: "you")
}