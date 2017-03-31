package kotlin99

/**
 * Created by rick on 2017/3/2.
 */

fun Int.totient(): Int = (1..this).count { it.isCoprimeTo(this) }
