package scala99

/**
  * Created by rick on 3/31/2017.
  */
object P12 {
    def decode[T](list: List[(Int, T)]): List[T] = {
        list flatMap {x => List.fill(x._1)(x._2)}
    }
}


