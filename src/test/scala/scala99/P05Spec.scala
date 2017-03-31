package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P05Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List(1, 1, 2, 3, 5, 8)
        val reversedList = List(8, 5, 3, 2, 1, 1)
    }

    "reverseBuiltin" should "return correctly" in {
        P05.reverseBuiltin(fixture.list) should be(fixture.reversedList)
    }
    "reverseRecursive" should "return correctly" in {
        P05.reverseRecursive(fixture.list) should be(fixture.reversedList)
    }
    "reverseTailRecursive" should "return correctly" in {
        P05.reverseTailRecursive(fixture.list) should be(fixture.reversedList)
    }
}
