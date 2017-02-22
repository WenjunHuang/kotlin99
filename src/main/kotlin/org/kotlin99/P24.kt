package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun lotto(count:Int, upperBound:Int, random:Random = Random()): List<Int>{
    return randomSelect(count , (1..upperBound).toList(), random)
}
class P24Test {
    @Test
    fun `Draw N different random numbers from the set 1 to M`() {
        assertThat(lotto(3, 49, Random(123)),
                equalTo(listOf(32,28,8)))
    }
}
