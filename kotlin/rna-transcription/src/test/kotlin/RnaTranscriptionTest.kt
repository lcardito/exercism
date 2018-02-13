import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
class RnaTranscriptionTest(private val testFunction: (String) -> String) {

    /*
      In Kotlin functions can be declared at top level in a file, meaning
      you do not need to create a class to hold a function, like languages
      such as Java, C# or Scala.

      http://kotlinlang.org/docs/reference/functions.html#function-scope

     */

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<(String) -> String> {
            return listOf(::transcribeToRna, ::transcribeToRnaMapReduce)
        }
    }

    @Test
    fun cytosineComplementIsGuanine() {
        assertEquals("G", testFunction("C"))
    }

    @Test
    fun guanineComplementIsCytosine() {
        assertEquals("C", testFunction("G"))
    }

    @Test
    fun thymineComplementIsAdenine() {
        assertEquals("A", testFunction("T"))
    }

    @Test
    fun adenineComplementIsUracil() {
        assertEquals("U", testFunction("A"))
    }

    @Test
    fun rnaTranscription() {
        assertEquals("UGCACCAGAAUU", testFunction("ACGTGGTCTTAA"))
    }

}
