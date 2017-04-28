package scala99

/**
  * Created by rick on 3/31/2017.
  */
object P10 {
    def encode[T](list: List[T]): List[(Int, T)] = {
        val packs = P09.pack(list)
        packs.map { x =>
            (x.length, x.head)
        }
    }
}


