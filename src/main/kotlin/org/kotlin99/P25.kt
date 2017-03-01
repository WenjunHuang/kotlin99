package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun randomPermute(list: List<Char>, random: Random = Random()): List<Char> = randomSelect(list.size, list, random)

class P25Test {
    @Test
    fun `generate a random permutation of the elements of a list`() {
        assertThat(randomPermute("abcdef".toList(), Random(123)),
                equalTo("dbefac".toList()))
    }
}
