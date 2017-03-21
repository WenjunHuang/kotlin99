package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun rotate(count: Int, list: List<Char>): List<Char> {
    if (list.isEmpty())
        return emptyList()

    if (count >= 0)
        return list.drop(count) + list.take(count)
    else
        return list.takeLast(-count) + list.dropLast(-count)

}

class P19Test {
    @Test
    fun emptyList() {
        assertThat(rotate(3, "".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun countIsPositiveAndInRange() {
        assertThat(rotate(3, "abcdefg".toList()),
                equalTo("defgabc".toList()))
    }

    @Test
    fun countIsNegativeAndIsInRange() {
        assertThat(rotate(-2, "abcdefg".toList()),
                equalTo("fgabcde".toList()))
    }

    @Test
    fun countIsGreaterThanListSize_ReturnEqualList() {
        assertThat(rotate(10, "abcdefg".toList()),
                equalTo("abcdefg".toList()))
    }

    @Test
    fun countIsNegativeAndGreaterThanListSize_ReturnEqualList() {
        assertThat(rotate(-10, "abcdefg".toList()),
                equalTo("abcdefg".toList()))
    }
}