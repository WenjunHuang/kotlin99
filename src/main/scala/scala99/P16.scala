package scala99

/**
  * Created by rick on 3/31/2017.
  */
object P16 {
    def drop[T](i: Int, list: List[T]): List[T] = {
        list.zipWithIndex filter { x => ((x._2 + 1) % i) != 0 } map { x => x._1 }
    }
}
