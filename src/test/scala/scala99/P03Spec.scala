package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P03Spec extends FlatSpec with Matchers {
    "Kth element of a list" should "return correctly" in {
        P03.nth(2, List(1, 1, 2, 3, 5, 8)) should be(2)
    }

}
