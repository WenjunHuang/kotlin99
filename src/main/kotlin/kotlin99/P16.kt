package kotlin99

/**
 * Created by rick on 2017/2/20.
 */
fun drop(count: Int, list: List<Char>): List<Char> {
    if (list.isEmpty())
        return emptyList()
    else if (count > list.size){
        return list
    } else {
        return list.filterIndexed { index, data ->
            (index + 1) % count != 0
        }
    }
}

