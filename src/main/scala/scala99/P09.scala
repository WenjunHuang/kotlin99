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


