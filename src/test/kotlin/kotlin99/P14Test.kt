package kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

class P14Test {
    @Test
    fun noElement() {
        assertEquals(emptyList<Char>(), duplicate(emptyList<Char>()))
    }

    @Test
    fun oneElement() {
        assertEquals(listOf('a', 'a'), duplicate("a".toList()))
    }

    @Test
    fun twoElements() {
        assertEquals(listOf('a', 'a', 'b', 'b'), duplicate("ab".toList()))
    }

    @Test
    fun multipleElements() {
        assertEquals(listOf('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd'),
                duplicate("abccd".toList()))
    }
}