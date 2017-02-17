package org.kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by rick on 2017/2/17.
 */
fun <T> pack(list: List<T>): List<List<T>> {
    if (list.isEmpty())
        return emptyList()
    else {
        val result = list.takeWhile {
            it == list[0]
        }
        return listOf(result) + pack(list.takeLast(list.size - result.size))
    }
}

class P09Test {
    @Test
    fun emptyList_ReturnEmptyList() {
        assertEquals(emptyList<Any?>(), pack("".toList()))
    }

    @Test
    fun singleElement_ReturnListWithSingleElement() {
        assertEquals(listOf(listOf('1')), pack("1".toList()))
    }

    @Test
    fun twoDifferentElements() {
        assertEquals(listOf(listOf('a'), listOf('b')), pack("ab".toList()))
    }

    @Test
    fun singleConsecutiveDuplicates() {
        assertEquals(listOf(listOf('a', 'a')), pack("aa".toList()))
    }

    @Test
    fun twoConsecutiveDuplicates() {
        assertEquals(listOf(
                "aaa".toList(),
                "bbb".toList()),
                pack("aaabbb".toList()))
    }

    @Test
    fun consecutiveDuplicates() {
        assertEquals(listOf(
                "aa".toList(),
                "c".toList(),
                "ddd".toList(),
                "cc".toList(),
                "eeeee".toList(),
                "f".toList()
        ), pack("aacdddcceeeeef".toList()))
    }
}