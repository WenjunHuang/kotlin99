package scala99

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


