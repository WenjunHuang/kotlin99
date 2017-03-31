package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P16Spec extends FlatSpec with Matchers {
    def fixture = new {
        val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
        val result = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }

    it should "drop every 3th element from a list" in {
        P15.drop(3, fixture.list) should contain theSameElementsInOrderAs (fixture.result)
    }
}


