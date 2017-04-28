package scala99

/**
  * Created by rick on 2017/3/19.
  */
object P02 {
    def penultimateBuiltin[T](list: List[T]): T =
        if (list.isEmpty) throw new NoSuchElementException
        else list.init.last

    def penultimateRecursive[T](list: List[T]): T = list match {
        case h :: _ :: Nil => h
        case _ :: tail => penultimateRecursive(tail)
        case _ => throw new NoSuchElementException
    }
}

