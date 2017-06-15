package scala99

/**
  * Created by rick on 2017/6/15.
  */
object P19 {
    def rotate[T](places: Int, list: List[T]) = (places, list) match {
        case (0, _) | (_, Nil) => list
        case (i, _) if i > 0 =>
            val l = list.length
            list.drop(i % l) ++ list.slice(0, i % l)
        case (i, _) if i < 0 =>
            val l = list.length
            val r = i % l
            list.drop(l + r) ++ list.take(l + r)
    }
}
