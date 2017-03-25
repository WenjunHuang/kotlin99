package org.kotlin99

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by rick on 2017/2/22.
 */

fun split(index: Int, list: List<Char>): Pair<List<Char>, List<Char>> {
    if (list.isEmpty())
        return Pair(emptyList<Char>(), emptyList<Char>())
    else {
        return Pair(list.take(index), list.drop(index))
    }
}

class P17Test {
    @Test
    fun emptyList() {
        assertThat(split(3, "".toList()),
                equalTo(Pair(emptyList<Char>(), emptyList<Char>())))
    }

    @Test
    fun indexIsZero() {
        assertThat(split(0, "abc".toList()),
                equalTo(Pair(emptyList<Char>(), "abc".toList())))
    }

    @Test
    fun indexGreaterThanListSize() {
        assertThat(split(5, "abc".toList()),
                equalTo(Pair("abc".toList(), emptyList<Char>())))
    }

    @Test
    fun indexAtFirstElement() {
        assertThat(split(0, "abc".toList()),
                equalTo(Pair(emptyList<Char>(), "abc".toList())))
    }

    @Test
    fun indexAtLastElement() {
        assertThat(split(2,"abc".toList()),
                equalTo(Pair("ab".toList(), "c".toList())))
    }

    @Test
    fun indexInList() {
        assertThat(split(4, "abcdefg".toList()),
                equalTo(Pair("abcd".toList(), "efg".toList())))
    }
}