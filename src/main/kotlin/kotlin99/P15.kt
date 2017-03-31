package kotlin99

import java.util.*

/**
 * Created by rick on 2017/2/20.
 */

fun duplicate(count: Int, list: List<Char>): List<Char> = list.flatMap { Collections.nCopies(count, it) }

