package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
object P11 {
    def encodeModified[T](list:List[T]): List[Any] = {
        val packs = P09.pack(list)
        packs.map {x =>
            if (x.length == 1)
                x.head
            else
                (x.length, x.head)
        }
    }
}

class P11Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        val result = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    }

    it should "return correctly" in {
        P11.encodeModified(fixture.list) should contain theSameElementsInOrderAs(fixture.result)
    }
}
