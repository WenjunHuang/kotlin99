package org.kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

fun <T : Any> encodeModified(list: List<T>): List<Any> {
    if (list.size <= 1)
        return list
    else {
//        var result = list.takeWhile { it == list[0] }
//        val first = if (result.size == 1) result[0] else Pair(result.size, result[0])
//        return listOf(first) +
//                encodeModified(list.drop(result.size))

        var element = list[0]
        var lowBound = 0
        val result = mutableListOf<Any>()

        for (i in 1 until list.size) {
            if (element != list[i]) {
                val count = i - lowBound
                result.add(if (count == 1) element else Pair(count, element))

                element = list[i]
                lowBound = i
            }
        }

        val count = list.size - lowBound
        result.add(if (count == 1) element else Pair(count, element))

        return result
    }
}

class P11Test {

    @Test
    fun emptyString() {
        assertEquals(emptyList<Any>(), encodeModified("".toList()))
    }

    @Test
    fun singleCharacter() {
        assertEquals(listOf('a'), encodeModified("a".toList()))
    }

    @Test
    fun twoCharacters() {
        assertEquals(listOf('a', 'b'), encodeModified("ab".toList()))
    }

    @Test
    fun oneConsecutiveDuplicateWithTwoCharacters() {
        assertEquals(listOf(Pair(2, 'a')), encodeModified("aa".toList()))
    }

    @Test
    fun oneConsecutiveDuplicateWithThreeCharacters() {
        assertEquals(listOf(Pair(3, 'a')), encodeModified("aaa".toList()))
    }

    @Test
    fun oneConsecutiveDuplicateFollowedByAnotherCharacter() {
        assertEquals(listOf(Pair(3, 'a'), 'b'), encodeModified("aaab".toList()))
    }

    @Test
    fun twoConsecutiveDuplicateSeperatedByAnotherCharacter() {
        assertEquals(listOf(Pair(3, 'a'), 'b', Pair(2, 'c')), encodeModified("aaabcc".toList()))
    }

}
