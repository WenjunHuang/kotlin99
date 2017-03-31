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

