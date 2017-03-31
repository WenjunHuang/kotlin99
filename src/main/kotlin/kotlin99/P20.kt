package kotlin99

/**
 * Created by Wenjun on 2017/2/22.
 */

fun removeAt(index: Int, list: List<Char>): Pair<List<Char>, Char?> {
    return if (0 <= index && index < list.size) Pair(list.filterIndexed { i, _ -> i != index },
            list[index]) else Pair(list, null)
}

