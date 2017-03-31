package org.kotlin99

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Created by rick on 2017/3/2.
 */
fun Int.isPrime(): Boolean
        = this > 1 && (2..Math.floor(Math.sqrt(toDouble())).toInt()).all { this@isPrime % it != 0 }


class P31Test {
    @Test
    fun `determine whether a given integer number is prime`() {
        assertTrue(7.isPrime())
        assertTrue(11.isPrime())
        assertTrue(23.isPrime())
        assertTrue(67.isPrime())

        assertFalse(4.isPrime())
        assertFalse(15.isPrime())
        assertFalse(21.isPrime())
        assertFalse(49.isPrime())
    }
}
