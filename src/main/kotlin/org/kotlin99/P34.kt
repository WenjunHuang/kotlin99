package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by rick on 2017/3/2.
 */

fun Int.totient(): Int = (1..this).count { it.isCoprimeTo(this) }
class P34Test {
    @Test
    fun `euler's totient function`() {
        assertThat(10.totient(), equalTo(4))
        assertThat(10090.totient(), equalTo(4032))
    }
}
