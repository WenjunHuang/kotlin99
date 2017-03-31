package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

/**
  * Created by rick on 2017/3/24.
  */
object P09 {
    def pack[T](list: List[T]): List[List[T]] = {
        if (list == null || list.isEmpty)
            Nil
        else {
            val (before, after) = list.span(x => x == list.head)
            before +: pack(after)
        }
    }
}

class P09Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        val result = List(List('a, 'a, 'a, 'a,'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    }

    "one element list" should "pack into a list of list" in {
        P09.pack(List('a)) should be(List(List('a)))
    }

    "a consecutive dulicates list" should "pack into a list of list" in {
        P09.pack(List('a, 'a, 'a)) should be(List(List('a, 'a, 'a)))
    }

    it should "pack consecutive duplicates of list elements into sublists" in {
        P09.pack(fixture.list) should be(fixture.result)
    }
}
