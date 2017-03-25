package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by rick on 2017/2/20.
 */
fun drop(count: Int, list: List<Char>): List<Char> {
    if (list.isEmpty())
        return emptyList()
    else if (count > list.size){
        return list
    } else {
        return list.filterIndexed { index, data ->
            (index + 1) % count != 0
        }
    }
}

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