package kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class P26Test {
    @Test
    fun twoElement() {
        assertThat(combinations(1, "ab".toList()),
                equalTo(listOf(
                        "a".toSet(),
                        "b".toSet()
                )))
    }

    @Test
    fun `combinations of 2 of 2 elements`() {
        assertThat(combinations(2, "ab".toList()),
                equalTo(listOf("ab".toSet())))
    }

    @Test
    fun `generate the combinations of K distinct objects chosen from the N elements of a list`() {
        assertThat(combinations(3, "abcde".toList()),
                equalTo(listOf(
                        "cba".toSet(),
                        "dba".toSet(),
                        "eba".toSet(),
                        "dca".toSet(),
                        "eca".toSet(),
                        "eda".toSet(),
                        "dcb".toSet(),
                        "ecb".toSet(),
                        "edb".toSet(),
                        "edc".toSet()
                )))
    }
}