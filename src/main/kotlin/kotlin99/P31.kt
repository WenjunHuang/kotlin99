package kotlin99

/**
 * Created by rick on 2017/3/2.
 */
fun Int.isPrime(): Boolean
        = this > 1 && (2..Math.floor(Math.sqrt(toDouble())).toInt()).all { this@isPrime % it != 0 }


