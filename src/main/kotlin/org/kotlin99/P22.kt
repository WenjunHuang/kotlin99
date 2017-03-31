package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun range(start: Int, endInclusive: Int): List<Int> {
    return (start..endInclusive).toList()
}

class P22Test {
    @Test
    fun `start equals to end`() {
        assertThat(range(4, 4),
                equalTo(listOf(4)))
    }

    @Test
    fun `list contains all integers with a given range`() {
        assertThat(range(4, 9),
                equalTo(listOf(4, 5, 6, 7, 8, 9)))
    }
}