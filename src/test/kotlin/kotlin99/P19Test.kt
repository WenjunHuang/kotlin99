package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P19Test {
    @Test
    fun emptyList() {
        assertThat(rotate(3, "".toList()),
                equalTo(emptyList<Char>()))
    }

    @Test
    fun countIsPositiveAndInRange() {
        assertThat(rotate(3, "abcdefg".toList()),
                equalTo("defgabc".toList()))
    }

    @Test
    fun countIsNegativeAndIsInRange() {
        assertThat(rotate(-2, "abcdefg".toList()),
                equalTo("fgabcde".toList()))
    }

    @Test
    fun countIsGreaterThanListSize_ReturnEqualList() {
        assertThat(rotate(10, "abcdefg".toList()),
                equalTo("abcdefg".toList()))
    }

    @Test
    fun countIsNegativeAndGreaterThanListSize_ReturnEqualList() {
        assertThat(rotate(-10, "abcdefg".toList()),
                equalTo("abcdefg".toList()))
    }
}