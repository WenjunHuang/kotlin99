package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P20Test {

    @Test
    fun removeFirstElementOfSingleElementList() {
        assertThat(removeAt(0, "a".toList()), equalTo(pair("".toList(), 'a')))
    }

    @Test
    fun removeFirstElementOfTwoElementsList() {
        assertThat(removeAt(0, "ab".toList()),
                equalTo(pair("b".toList(), 'a')))
    }

    @Test
    fun removeElementInRange() {
        val expected = "abcefg".toList()
        val data = "abcdefg".toList()
        val removedChar = 'd'
        assertThat(removeAt(3, data),
                equalTo(pair(expected, removedChar)))
    }

    @Test
    fun indexOverflow_ReturnOriginalListAndNullRemovedChar() {
        assertThat(removeAt(10, "abcdefg".toList()),
                equalTo(pair("abcdefg".toList(), null)))
    }

    private fun pair(expected: List<Char>, removedChar: Char?) = Pair(expected, removedChar)
}