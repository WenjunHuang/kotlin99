package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by Wenjun on 2017/2/22.
 */

fun removeAt(index: Int, list: List<Char>): Pair<List<Char>, Char> {
    return Pair(list.filterIndexed { i, _ -> i != index },
            list[index])
}

class P20Test {

    @Test
    fun removeFirstElementOfSingleElementList() {
        assertThat(removeAt(0, "a".toList()), equalTo(Pair("".toList(), 'a')))
    }

    @Test
    fun removeFirstElementOfTwoElementsList() {
        assertThat(removeAt(0, "ab".toList()),
                equalTo(Pair("b".toList(), 'a')))
    }
}
