package kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

class P15Test {
    @Test
    fun noElement() {
        assertEquals(emptyList<Char>(), duplicate(3, emptyList<Char>()))
    }

    @Test
    fun oneElement() {
        assertEquals(listOf('a', 'a'), duplicate(2, "a".toList()))
    }

    @Test
    fun duplicateNIsZero_ReturnEmptyList() {
        assertEquals(emptyList<Char>(), duplicate(0, "ab".toList()))
    }

    @Test
    fun duplicateMultipleTimesWithNonEmptyList_ReturnExpected() {
        assertEquals(listOf('a', 'a', 'a', 'd', 'd', 'd', 'c', 'c', 'c', 'c', 'c', 'c'),
                duplicate(3, "adcc".toList()))

    }

}