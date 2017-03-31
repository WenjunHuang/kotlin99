package kotlin99

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

