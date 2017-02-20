package org.kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by rick on 2017/2/18.
 */

fun <T> encodeDirect(list: List<T>): List<Pair<Int, T>> {
    if (list.isEmpty())
        return emptyList()
    else {
        if (list.size == 1)
            return listOf(Pair(1, list[0]))
        else {
            var result = list.takeWhile { it == list[0] }
            return listOf(Pair(result.size, result[0])) + encodeDirect(list.drop(result.size))
        }
    }
}

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
