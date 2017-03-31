package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
object P13 {
    def encodeDirect[T](list: List[T]): List[(Int, T)] = {
        if (list.isEmpty)
            Nil
        else {
            val (before, after) = list.span(_ == list.head)
            (before.length, before.head) +: encodeDirect(after)
        }
    }

}

class P13Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        val result = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    }

    it should "return run-length encoding" in {
        P13.encodeDirect(fixture.list) should contain theSameElementsInOrderAs (fixture.result)
    }
}
