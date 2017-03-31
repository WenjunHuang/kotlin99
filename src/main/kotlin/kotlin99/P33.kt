package kotlin99

/**
 * Created by rick on 2017/3/2.
 */

fun Int.isCoprimeTo(other:Int):Boolean = gcd(this, other) == 1

