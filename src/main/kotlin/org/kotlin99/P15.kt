package org.kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

/**
 * Created by rick on 2017/2/20.
 */

fun duplicate(count: Int, list: List<Char>): List<Char> = list.flatMap { Collections.nCopies(count, it) }

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
    fun duplicateNIsZero_ReturnEmptyList () {
        assertEquals(emptyList<Char>(), duplicate(0, "ab".toList()))
    }

    @Test
    fun duplicateMultipleTimesWithNonEmptyList_ReturnExpected () {
        assertEquals(listOf('a','a','a','d','d','d','c','c','c','c','c','c'),
                duplicate(3, "adcc".toList()))
        
    }

}