package kotlin99

/**
 * Created by rick on 2017/2/20.
 */

fun duplicate(list: List<Char>): List<Char> = list.flatMap { listOf(it, it) }

