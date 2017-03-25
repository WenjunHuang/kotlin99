package scala99

import org.scalatest.{FlatSpec, Matchers}

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

class P08Spec extends FlatSpec with Matchers {
  def fixture = new {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List('a, 'b, 'c, 'a, 'd, 'e)
  }

  it should "eliminate consecutive duplicates of list elements" in {
    P08.compress(fixture.list) should be(fixture.result)
  }

}
