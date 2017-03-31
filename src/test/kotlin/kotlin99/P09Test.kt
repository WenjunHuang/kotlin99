package kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test


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