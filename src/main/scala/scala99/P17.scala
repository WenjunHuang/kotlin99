package scala99

/**
  * Created by rick on 2017/4/28.
  */
object P17 {
    def split[T](n: Int, list: List[T]) = {
        list.splitAt(n)
    }
}
