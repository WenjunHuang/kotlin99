package org.kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by rick on 2017/2/20.
 */
fun decode(list: List<Pair<Int, Char>>): List<Char> {
    if (list.isEmpty())
        return emptyList()
    else {
        return list.fold(emptyList<Char>()) { result, value ->
            result + mutableListOf<Char>().apply {
                for (i in 1..value.first)
                    add(value.second)
            }
        }
    }
}

class P12Test {
    @Test
    fun emptyList_ReturnEmptyList() {
        assertEquals(emptyList<Char>(), decode(emptyList<Pair<Int, Char>>()))
    }

    @Test
    fun onePairElement_ReturnExpected() {
        assertEquals(listOf('a', 'a'), decode(listOf(Pair(2, 'a'))))
    }

    @Test
    fun twoPairs_ReturnExpected() {
        assertEquals(listOf('a', 'a', 'b', 'b'), decode(listOf(Pair(2, 'a'), Pair(2, 'b'))))
    }

    @Test
    fun multiplePairs_ReturnExpected() {
        assertEquals(listOf('a', 'a', 'b', 'c', 'c', 'c', 'c', 'd', 'd', 'e', 'e'),
                decode(listOf(Pair(2, 'a'), Pair(1, 'b'), Pair(4, 'c'), Pair(2, 'd'), Pair(2, 'e'))))
    }
}