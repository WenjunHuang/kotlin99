package kotlin99

import org.junit.Assert.assertEquals
import org.junit.Test

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
