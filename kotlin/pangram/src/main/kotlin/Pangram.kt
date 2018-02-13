object Pangram {
    fun isPangram(sentence: String): Boolean = ('a'..'z').all { c -> sentence.contains(c, true) }
}