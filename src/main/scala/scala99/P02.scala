package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/19.
  */
object P02 {
    def penultimateBuiltin[T](list:List[T]):T =
        if (list.isEmpty) throw new NoSuchElementException
        else list.init.last

    def penultimateRecursive[T](list:List[T]): T = list match {
        case h :: _::Nil => h
        case _ :: tail => penultimateRecursive(tail)
        case _ => throw new NoSuchElementException
    }
}
class P02Spec extends FlatSpec with Matchers {
    "last but one with builtin" should "return correctly" in {
        P02.penultimateBuiltin(List(1,1,2,3,5,5)) should be(5)
    }
    "last but one with recursive" should "return correctly" in {
        P02.penultimateRecursive(List(1,1,2,3,5,5)) should be(5)
    }
}
