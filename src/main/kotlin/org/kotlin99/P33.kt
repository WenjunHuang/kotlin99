package org.kotlin99

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Created by rick on 2017/3/2.
 */

fun Int.isCoprimeTo(other:Int):Boolean = gcd(this, other) == 1

class P33Test {
    @Test
    fun `35 is coprime to 64`() {
        assertTrue(35.isCoprimeTo(64))
    }
}
