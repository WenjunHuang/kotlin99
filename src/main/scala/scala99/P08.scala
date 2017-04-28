package scala99

import scala.collection.mutable

/**
  * Created by rick on 2017/3/21.
  */
object P08 {
  def compress[T](list: List[T]): List[T] = {
    if (list.isEmpty)
      Nil
    else {
     var result = mutable.MutableList[T](list.head)
      for (item <- list.tail){
        if (item != result.last)
          result += item
      }
      result.toList
    }
  }
}


