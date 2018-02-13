import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import kotlin.test.assertEquals

class HammingTest {

    @Rule
    @JvmField
    var expectedException: ExpectedException = ExpectedException.none()

    @Test
    fun noDistanceBetweenEmptyStrands() {
        assertEquals(0, Hamming.compute("", ""))
        assertEquals("", Hamming.diff("", ""))
    }

    @Test
    fun noDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, Hamming.compute("A", "A"))
        assertEquals("", Hamming.diff("", ""))
    }

    @Test
    fun noDistanceBetweenLongIdenticalStrands() {
        assertEquals(0, Hamming.compute("GGACTGA", "GGACTGA"))
        assertEquals("", Hamming.diff("GGACTGA", "GGACTGA"))
    }

    @Test
    fun completeDistanceInSingleNucleotideStrand() {
        assertEquals(1, Hamming.compute("A", "G"))
        assertEquals("G", Hamming.diff("A", "G"))
    }

    @Test
    fun completeDistanceInSmallStrand() {
        assertEquals(2, Hamming.compute("AG", "CT"))
    }

    @Test
    fun smallDistanceInSmallStrand() {
        assertEquals(1, Hamming.compute("AT", "CT"))
    }

    @Test
    fun smallDistanceInMediumStrand() {
        assertEquals(1, Hamming.compute("GGACG", "GGTCG"))
    }

    @Test
    fun smallDistanceInLongStrand() {
        assertEquals(2, Hamming.compute("ACCAGGG", "ACTATGG"))
        assertEquals("  T T  ", Hamming.diff("ACCAGGG", "ACTATGG"))
    }

    @Test
    fun nonUniqueCharacterInFirstStrand() {
        assertEquals(1, Hamming.compute("AAG", "AAA"))
    }

    @Test
    fun nonUniqueCharacterInSecondStrand() {
        assertEquals(1, Hamming.compute("AAA", "AAG"))
    }

    @Test
    fun sameNucleotidesInDifferentPositions() {
        assertEquals(2, Hamming.compute("TAG", "GAT"))
    }

    @Test
    fun largeDistanceInPermutedStrand() {
        assertEquals(4, Hamming.compute("GATACA", "GCATAA"))
    }

    @Test
    fun largeDistanceInOffByOneStrand() {
        assertEquals(9, Hamming.compute("GGACGGATTCTG", "AGGACGGATTCT"))
    }

    @Test
    fun validatesFirstStrandNotLonger() {
        expectedException.expect(IllegalArgumentException::class.java)
        expectedException.expectMessage("left and right strands must be of equal length.")

        Hamming.compute("AATG", "AAA")
    }

    @Test
    fun validatesSecondStrandNotLonger() {
        expectedException.expect(IllegalArgumentException::class.java)
        expectedException.expectMessage("left and right strands must be of equal length.")

        Hamming.compute("ATA", "AGTG")
    }

}
