package org.kotlin99

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun <T> combinations(count: Int, list: List<T>): List<Set<T>> {

    if (count == 0)
        return listOf(emptySet())
    if (count > list.size)
        return emptyList()

    return list.mapIndexed { index, t ->
        combinations(count - 1, list.drop(index + 1)).map{it+ listOf(t)}
    }.flatMap { it }
}

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
