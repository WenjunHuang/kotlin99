package kotlin99

/**
 * Created by rick on 2017/2/18.
 */

fun <T> encodeDirect(list: List<T>): List<Pair<Int, T>> {
    if (list.isEmpty())
        return emptyList()
    else {
        if (list.size == 1)
            return listOf(Pair(1, list[0]))
        else {
            var result = list.takeWhile { it == list[0] }
            return listOf(Pair(result.size, result[0])) + encodeDirect(list.drop(result.size))
        }
    }
}

