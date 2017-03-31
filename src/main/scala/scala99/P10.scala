package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
object P10 {
    def encode[T](list: List[T]): List[(Int, T)] = {
        val packs = P09.pack(list)
        packs.map { x =>
            (x.length, x.head)
        }
    }
}

class P10Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        val result = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    }

    it should "return (1,'a)" in {
        P10.encode(List('a)) should be(List((1, 'a)))
    }

    it should "return run-length encoding of a list" in {
        P10.encode(fixture.list) should contain theSameElementsInOrderAs(fixture.result)
    }
}
