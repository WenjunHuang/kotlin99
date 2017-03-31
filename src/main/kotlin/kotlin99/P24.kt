package kotlin99

import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun lotto(count: Int, upperBound: Int, random: Random = Random()): List<Int> {
    return randomSelect(count, (1..upperBound).toList(), random)
}

