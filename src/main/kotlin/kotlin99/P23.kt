package kotlin99

import java.util.*

/**
 * Created by Wenjun on 2017/2/22.
 */

fun <T> randomSelect(count: Int, list: List<T>, random: Random = Random()): List<T> =
        if (count == 0) emptyList()
        else {
            val value = list[random.nextInt(list.size)]
            randomSelect(count - 1, list.filter { it != value }, random) + value
        }

