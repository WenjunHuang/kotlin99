package scala99

import org.scalatest.{FlatSpec, _}

/**
  * Created by rick on 2017/3/19.
  */
object P01 {
    def last[T](list: List[T]): T = list.last

}

class P01 extends FlatSpec with Matchers {
    "last element of a list" should "return correctly" in {
        P01.last(List(1, 1, 2, 3, 5, 6)) should be(6)
        P01.last(List("hello", "world", "hi", "greet")) should be("greet")
    }
}
