package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by rick on 2017/3/2.
 */

fun gcd(a: Int, b: Int): Int {
    if (a <= 0 || b <= 0)
        throw IllegalArgumentException("input can not be negative or zero")

    var x = Math.max(a, b)
    var y = Math.min(a, b)
    var r = x % y

    while (r > 0){
        x = y
        y = r
        r = x % y
    }
    return y
}

class P32Test {
    @Test
    fun `gcd of 2 and 3 is 1`() {
        assertThat(gcd(2, 3), equalTo(1))
    }

    @Test
    fun `gcd of 3 and 6 is 3`() {
        assertThat(gcd(3, 6), equalTo(3))
    }

    @Test
    fun `gcd of 36 and 63 is 9`() {
        assertThat(gcd(36,63), equalTo(9))
    }
}
