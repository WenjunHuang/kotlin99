package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/20.
  */
object P04 {
    def lengthBuiltin[T](list: List[T]) = list.size

    def lengthRecursive[T](list: List[T]): Int = list match {
        case Nil => 0
        case _ :: rest => 1 + lengthRecursive(rest)
    }
}

class P04Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List(1,1,2,3,5,8)
    }
    "lengthBuiltin" should "return size of the list" in {
        P04.lengthBuiltin(fixture.list) should be(6)

        val m = Map("a"->1,"b"-> 2,"c"->3)

        val f1 = (64 + 1).toChar
        m.mapValues(x => (x + 64).toChar)

    }

    "lengthRecursive" should "return size of the list" in {
        P04.lengthRecursive(fixture.list) should be(6)
    }
}
