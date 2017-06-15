package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 2017/4/28.
  */
@RunWith(classOf[JUnitRunner])
class P18Spec extends FlatSpec with Matchers {
    def fixture = new {
        val source = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
        val result = List('d, 'e, 'f, 'g)
    }

    "Extract a slice from a list" should "be ok" in {
        P18.slice(3, 7, fixture.source) should contain theSameElementsInOrderAs fixture.result
    }
}


