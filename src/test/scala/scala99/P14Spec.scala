package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P14Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'b, 'c, 'c, 'd)
        val result = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }

    it should "duplicate the elements of a list" in {
        P14.duplicate(fixture.list) should contain theSameElementsInOrderAs(fixture.result)
    }
}
