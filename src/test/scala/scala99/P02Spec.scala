package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P02Spec extends FlatSpec with Matchers {
    "last but one with builtin" should "return correctly" in {
        P02.penultimateBuiltin(List(1,1,2,3,5,5)) should be(5)
    }
    "last but one with recursive" should "return correctly" in {
        P02.penultimateRecursive(List(1,1,2,3,5,5)) should be(5)
    }
}
