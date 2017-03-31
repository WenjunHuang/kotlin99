package scala99

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P15Spec extends FlatSpec with Matchers{
    def fixture = new {
        val list = List('a, 'b, 'c, 'c, 'd)
        val result =  List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }

    it should "duplicate the elements of a list a given number of times" in {
        P15.duplicateN(3, fixture.list) should contain theSameElementsInOrderAs(fixture.result)
    }

}

object P15 {
    def duplicateN[T](n: Int, list: List[T]):List[T] = {
       list map {x => List.fill(n)(x)} flatten
    }
}
