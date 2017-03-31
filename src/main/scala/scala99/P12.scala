package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
object P12 {
    def decode[T](list: List[(Int, T)]): List[T] = {
        list flatMap {x => List.fill(x._1)(x._2)}
    }
}

class P12Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
        val result = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }

    it should "return correctly" in {
        P12.decode(fixture.list) should contain theSameElementsInOrderAs (fixture.result)
    }
}
