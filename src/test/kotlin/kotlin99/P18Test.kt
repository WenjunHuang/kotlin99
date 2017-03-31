package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P18Test{
    @Test
    fun emptyList() {
        assertThat(slice(0, 3, "".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun fromOverflow_ReturnEmpty() {
        assertThat(slice(3, 3, "abc".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun toUnderflow_ReturnEmpty() {
        assertThat(slice(0, -3, "abc".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun fromGreaterThanTo_ReturnEmpty() {
        assertThat(slice(2, 0, "abc".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun fromLessThanZero_ReturnFromZeroUntilTo() {
        assertThat(slice(-2, 2, "abc".toList()),
                equalTo("ab".toList()))
    }

    @Test
    fun toGreaterThanListSize_ReturnFromStart() {
        assertThat(slice(1, 6, "abc".toList()),
                equalTo("bc".toList()))
    }
}