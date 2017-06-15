package scala99

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by rick on 2017/6/15.
  */
class P20Spec extends FunSuite with Matchers {
    val fixture = new {
        val list = List('a, 'b, 'c, 'd)
    }

    test("remove from a Nil should return (Nil, None)") {
        P20.removeAt(1, Nil) should be((Nil, None))
    }

    test("remove first element should run correctly") {
        val (l, r) = P20.removeAt(0, fixture.list)
        l should contain theSameElementsInOrderAs ((List('b, 'c, 'd)))
        r should be(Some('a))
    }

    test("remove element with bound should run correctly") {
        val (l, r) = P20.removeAt(1, fixture.list)
        l should contain theSameElementsInOrderAs (List('a, 'c, 'd))
        r should be(Some('b))
    }

    test("remove element out of bound should return original list and None") {
        val (l, r) = P20.removeAt(200, fixture.list)
        l should contain theSameElementsInOrderAs(fixture.list)
        r should be(None)
    }

    test("negative  index should return original list and None") {
        val (l, r) = P20.removeAt(-19,fixture.list)
        l should contain theSameElementsInOrderAs(fixture.list)
        r should be(None)
    }
}


