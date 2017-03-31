package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P22Test {
    @Test
    fun `start equals to end`() {
        assertThat(range(4, 4),
                equalTo(listOf(4)))
    }

    @Test
    fun `list contains all integers with a given range`() {
        assertThat(range(4, 9),
                equalTo(listOf(4, 5, 6, 7, 8, 9)))
    }
}