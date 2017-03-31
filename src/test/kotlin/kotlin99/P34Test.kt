package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P34Test {
    @Test
    fun `euler's totient function`() {
        assertThat(10.totient(), equalTo(4))
        assertThat(10090.totient(), equalTo(4032))
    }
}