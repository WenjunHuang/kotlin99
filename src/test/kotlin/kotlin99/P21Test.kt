package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P21Test {
    @Test
    fun `insert an element at a given position into a list`() {
        assertThat(insertAt('X', 1, "abcd".toList()),
                equalTo("aXbcd".toList()))
    }
}