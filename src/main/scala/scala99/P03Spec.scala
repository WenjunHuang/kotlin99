package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/19.
  */
object P03 {
    def nth[T](n: Int, list: List[T]): T =
        if (n >= 0)
            list(n)
        else
            throw new NoSuchElementException
}

class P03Spec extends FlatSpec with Matchers {
    "Kth element of a list" should "return correctly" in {
        P03.nth(2, List(1, 1, 2, 3, 5, 8)) should be(2)
    }

}
