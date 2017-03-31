package kotlin99

/**
 * Created by rick on 2017/3/2.
 */

fun gcd(a: Int, b: Int): Int {
    if (a <= 0 || b <= 0)
        throw IllegalArgumentException("input can not be negative or zero")

    var x = Math.max(a, b)
    var y = Math.min(a, b)
    var r = x % y

    while (r > 0){
        x = y
        y = r
        r = x % y
    }
    return y
}

