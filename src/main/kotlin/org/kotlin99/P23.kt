package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun<T> randomSelect(count: Int, list: List<T>, random: Random = Random()): List<T> =
        if (count == 0) emptyList()
        else {
            val value = list[random.nextInt(list.size)]
            randomSelect(count - 1, list.filter { it != value }, random) + value
        }

class P23Test {
    @Test
    fun `extract a given number of randomly selected elements from a list`() {
        assertThat(randomSelect(3, "abcdefgh".toList(), Random(123)),
                equalTo("chf".toList()))
    }
}
