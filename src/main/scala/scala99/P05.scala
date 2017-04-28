package scala99

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


