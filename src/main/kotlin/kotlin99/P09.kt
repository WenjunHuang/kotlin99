package kotlin99
/**
 * Created by rick on 2017/2/17.
 */
fun <T> pack(list: List<T>): List<List<T>> {
    if (list.isEmpty())
        return emptyList()
    else {
        val result = list.takeWhile {
            it == list[0]
        }
        return listOf(result) + pack(list.takeLast(list.size - result.size))
    }
}

