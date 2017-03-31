package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P07Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List(List(1, 1), 2, List(3, List(5, 8)))
        val result = List(1,1,2,3,5,8)
    }

    it should "flatten a nested list structure" in {
        P07.flatten(fixture.list) should be(fixture.result)
    }
}
