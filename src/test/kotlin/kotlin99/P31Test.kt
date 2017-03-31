package kotlin99

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

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