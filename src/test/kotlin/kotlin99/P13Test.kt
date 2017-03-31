package kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

class P13Test {

    @Test
    fun emptyString() {
        assertEquals(emptyList<Pair<Int, Char>>(), encodeDirect("".toList()))
    }

    @Test
    fun singleCharactor() {
        assertEquals(listOf(Pair(1, 'a')), encodeDirect("a".toList()))
    }

    @Test
    fun oneConsecutiveDuplicates() {
        assertEquals(listOf(Pair(3, 'a')), encodeDirect("aaa".toList()))
    }

    @Test
    fun twoConsecutiveDuplicates() {
        assertEquals(listOf(Pair(3, 'a'), Pair(2, 'b')), encodeDirect("aaabb".toList()))
    }

    @Test
    fun manyConsecutiveDuplicates() {
        assertEquals(listOf(
                Pair(1, 'a'),
                Pair(2, 'b'),
                Pair(3, 'c'),
                Pair(3, 'a'),
                Pair(5, 'd')),
                encodeDirect("abbcccaaaddddd".toList())
        )
    }
}