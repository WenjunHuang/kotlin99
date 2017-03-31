package scala99


/**
  * Created by rick on 3/31/2017.
  */
object P14 {
    def duplicate[T](list:List[T]): List[T] = {
        list.map(List.fill(2)(_)).flatten
    }
}


