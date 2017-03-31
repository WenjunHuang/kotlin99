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


