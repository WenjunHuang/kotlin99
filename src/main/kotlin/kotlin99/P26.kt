package kotlin99

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

