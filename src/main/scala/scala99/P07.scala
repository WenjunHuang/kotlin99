package scala99

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/3/20.
  */
object P07 {
    def flatten(list:List[Any]):List[Any] = {
       list flatMap {
           case ms:List[_]  => flatten(ms)
           case e => List(e)
       }
    }
}
class P07Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List(List(1, 1), 2, List(3, List(5, 8)))
        val result = List(1,1,2,3,5,8)
    }

    it should "flatten a nested list structure" in {
        P07.flatten(fixture.list) should be(fixture.result)
    }
}
