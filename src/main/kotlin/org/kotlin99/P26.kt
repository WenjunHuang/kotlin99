package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun <T> combinations(count: Int, list: List<T>): List<List<T>> {

    if (count == 0 || count > list.size)
        return emptyList()

    return list.mapIndexed { index, t ->
        combinations(count - 1, list.drop(index + 1)).map { listOf(t) + it }
    }.first()
}

class P26Test {
    @Test
    fun twoElement() {
        assertThat(combinations(1, "ab".toList()),
                equalTo(listOf(
                        "a".toList(),
                        "b".toList()
                )))
    }

    @Test
    fun `generate the combinations of K distinct objects chosen from the N elements of a list`() {
        assertThat(combinations(3, "abcde".toList()),
                equalTo(listOf<List<Char>>(
                        "cba".toList(),
                        "dba".toList(),
                        "eba".toList(),
                        "dca".toList(),
                        "eca".toList(),
                        "eda".toList(),
                        "dcb".toList(),
                        "ecb".toList(),
                        "edb".toList(),
                        "edc".toList()
                )))
    }
}
