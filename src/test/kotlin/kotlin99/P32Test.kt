package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

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
        assertThat(gcd(36, 63), equalTo(9))
    }
}