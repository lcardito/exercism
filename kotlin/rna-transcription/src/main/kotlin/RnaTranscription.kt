val mapping = hashMapOf("G" to "C", "C" to "G", "T" to "A", "A" to "U")
fun transcribeToRna(dna: String): String = dna.map { it -> mapping[it.toString()] }.joinToString(separator = "")
