package kotlin99

/**
 * Created by rick on 2017/2/22.
 */

fun slice(from:Int, to:Int, list:List<Char>): List<Char> {
    if (from >= list.size || to < 0 || from > to)
        return emptyList()

    var f = if (from < 0) 0 else from
    var t = if (to >= list.size) list.size else to

    return list.slice(f until t)
}

