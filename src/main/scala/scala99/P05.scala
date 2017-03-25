package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/20.
  */
object P05 {
    def reverseBuiltin[T](list: List[T]) = list.reverse

    def reverseRecursive[T](list: List[T]): List[T] = list match {
        case Nil => Nil
        case head :: rest => reverseRecursive(rest) :+ head
    }

    def reverseTailRecursive[T](list: List[T]): List[T] = {
        def reverseR(result: List[T], curList: List[T]): List[T] = curList match {
            case Nil => result
            case h :: tail => reverseR(h :: result, tail)
        }

        reverseR(Nil, list)
    }

    def rverseFunctional[T](list: List[T]): List[T] =
        list.foldLeft(List[T]()) { (r, h) => h :: r }
}

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
