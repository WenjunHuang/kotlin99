package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 4/1/2017.
  */
class P17Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
        val result = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }

    it should "split a list into two parts" in {
        P17.split(3, fixture.list) should be(fixture.result)
    }
}

object P17 {
    def split[T](n: Int, list: List[T]) = {
        list.splitAt(n)
    }

}
