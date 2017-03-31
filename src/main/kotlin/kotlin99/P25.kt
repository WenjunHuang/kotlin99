package kotlin99

import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun randomPermute(list: List<Char>, random: Random = Random()): List<Char> = randomSelect(list.size, list, random)

