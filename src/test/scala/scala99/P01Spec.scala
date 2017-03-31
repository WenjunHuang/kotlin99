package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, _}



@RunWith(classOf[JUnitRunner])
class P01Spec extends FlatSpec with Matchers {
    "last element of a list" should "return correctly" in {
        P01.last(List(1, 1, 2, 3, 5, 6)) should be(6)
        P01.last(List("hello", "world", "hi", "greet")) should be("greet")
    }
}
