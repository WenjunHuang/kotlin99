package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Assert.assertEquals
import org.junit.Test

class P16Test {
    @Test
    fun emptyList_ReturnEmptyList() {
        assertEquals(emptyList<Char>(), drop(3, "".toList()))
    }

    @Test
    fun dropEveryElement() {
        assertEquals(emptyList<Char>(), drop(1, "abcd".toList()))
    }

    @Test
    fun dropNumberGreaterThanListSize() {
        assertEquals(listOf('a', 'b'), drop(3, "ab".toList()))
    }

    @Test
    fun dropEvery2ndElement() {
        assertThat(drop(2, "abcd".toList()),
                equalTo(listOf('a', 'c')))
    }
}