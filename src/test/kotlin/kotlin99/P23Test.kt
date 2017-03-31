package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

class P23Test {
    @Test
    fun `extract a given number of randomly selected elements from a list`() {
        assertThat(randomSelect(3, "abcdefgh".toList(), Random(123)),
                equalTo("chf".toList()))
    }
}