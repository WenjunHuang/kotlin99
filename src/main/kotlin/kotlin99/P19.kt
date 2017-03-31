package kotlin99

/**
 * Created by Wenjun on 2017/2/22.
 */

fun rotate(count: Int, list: List<Char>): List<Char> {
    if (list.isEmpty())
        return emptyList()

    if (count >= 0)
        return list.drop(count) + list.take(count)
    else
        return list.takeLast(-count) + list.dropLast(-count)

}

