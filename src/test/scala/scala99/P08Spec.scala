package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P08Spec extends FlatSpec with Matchers {
  def fixture = new {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val result = List('a, 'b, 'c, 'a, 'd, 'e)
  }

  it should "eliminate consecutive duplicates of list elements" in {
    P08.compress(fixture.list) should be(fixture.result)
  }

}
