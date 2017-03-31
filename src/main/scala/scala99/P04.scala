package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/20.
  */
object P04 {
    def lengthBuiltin[T](list: List[T]) = list.size

    def lengthRecursive[T](list: List[T]): Int = list match {
        case Nil => 0
        case _ :: rest => 1 + lengthRecursive(rest)
    }
}


