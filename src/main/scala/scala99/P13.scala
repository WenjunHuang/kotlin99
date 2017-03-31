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


