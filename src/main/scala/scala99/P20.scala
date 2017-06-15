package scala99

/**
  * Created by rick on 2017/6/15.
  */
object P20 {
    def removeAt[T](pos: Int, list: List[T]): (List[T], Option[T]) = (pos, list) match {
        case (_, Nil) => (Nil, None)
        case (i, _) if i < 0 => (list, None)
        case (i, list) if i >= list.length => (list, None)
        case (i, list) => (list.take(i) ++ list.drop(i + 1), Option(list(i)))
    }
}
