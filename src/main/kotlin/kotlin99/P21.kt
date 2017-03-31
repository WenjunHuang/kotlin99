package kotlin99

/**
 * Created by Wenjun on 2017/2/22.
 */

fun insertAt(toInsert: Char, index: Int, list: List<Char>): List<Char> {
    return list.take(index) + listOf(toInsert) + list.takeLast(list.size - index)
}

