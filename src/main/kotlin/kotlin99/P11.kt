package kotlin99

fun <T : Any> encodeModified(list: List<T>): List<Any> {
    if (list.size <= 1)
        return list
    else {
        var element = list[0]
        var lowBound = 0
        val result = mutableListOf<Any>()

        for (i in 1 until list.size) {
            if (element != list[i]) {
                val count = i - lowBound
                result.add(if (count == 1) element else Pair(count, element))

                element = list[i]
                lowBound = i
            }
        }

        val count = list.size - lowBound
        result.add(if (count == 1) element else Pair(count, element))

        return result
    }
}
