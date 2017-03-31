package kotlin99

/**
 * Created by rick on 2017/2/20.
 */
fun decode(list: List<Pair<Int, Char>>): List<Char> {
    if (list.isEmpty())
        return emptyList()
    else {
        return list.fold(emptyList<Char>()) { result, value ->
            result + mutableListOf<Char>().apply {
                for (i in 1..value.first)
                    add(value.second)
            }
        }
    }
}

