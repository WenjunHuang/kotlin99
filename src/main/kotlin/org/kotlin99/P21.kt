package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun insertAt(toInsert: Char, index: Int, list:List<Char>): List<Char>{
    return list.take(index) + listOf(toInsert )+ list.takeLast(list.size - index)
}
class P21Test {
    @Test
    fun `insert an element at a given position into a list`() {
        assertThat(insertAt('X', 1, "abcd".toList()),
                equalTo("aXbcd".toList()))
    }
}