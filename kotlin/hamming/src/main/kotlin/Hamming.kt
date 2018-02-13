object Hamming {
    fun compute(left: String, right: String): Int {
        require(left.length == right.length, { "left and right strands must be of equal length."})

        return left.zip(right)
                .filter { it.first != it.second }
                .count()
    }

    fun diff(left: String, right: String): String {
        require(left.length == right.length, { "left and right strands must be of equal length."})

        return left.zip(right)
                .joinToString(
                        separator = "",
                        transform = { it -> if(it.first != it.second) it.second.toString() else " " }
                )
    }
}