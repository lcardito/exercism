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