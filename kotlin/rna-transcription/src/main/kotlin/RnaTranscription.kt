fun transcribeToRna(dna: String): String =
        dna.fold("", { acc, ch ->
            when (ch) {
                'G' -> acc + "C"
                'C' -> acc + "G"
                'T' -> acc + "A"
                'A' -> acc + "U"
                else -> throw Error("Char not found for transcription")
            }
        })

fun transcribeToRnaMapReduce(dna: String): String =
        dna.map { c ->
            when (c) {
                'G' -> "C"
                'C' -> "G"
                'T' -> "A"
                'A' -> "U"
                else -> throw Error("Char not found for transcription")
            }
        }.reduce { acc, s -> acc + s }