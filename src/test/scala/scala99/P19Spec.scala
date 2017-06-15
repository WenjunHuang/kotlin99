package scala99

import org.junit.runner.RunWith
import org.scalatest.{FunSuite, Matchers}
import org.scalatest.junit.JUnitRunner

/**
  * Created by rick on 2017/6/15.
  */
@RunWith(classOf[JUnitRunner])
class P19Spec extends FunSuite with Matchers {
    val fixture = new {
        val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }

    test("rotate Nil should return Nil") {
        P19.rotate(1000, Nil) should be(Nil)
    }

    test("rotate with 0 places should remain the same list") {
        val result = P19.rotate(0, fixture.list)
        result should contain theSameElementsInOrderAs (fixture.list)
    }

    test("rotate with 1 element should give the correct result") {
        val result = P19.rotate(1, fixture.list)
        result should contain theSameElementsInOrderAs (List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a))
    }

    test("rotate 2 elements should give the correct result") {
        val result = P19.rotate(2, fixture.list)
        result should contain theSameElementsInOrderAs (List('c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b))
    }

    test("rotate places that greater than the size of list should give the correct result") {
        P19.rotate(11, fixture.list) should contain theSameElementsInOrderAs (fixture.list)
        P19.rotate(12, fixture.list) should contain theSameElementsInOrderAs (List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a))
        P19.rotate(20, fixture.list) should contain theSameElementsInOrderAs (List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
    }

    test("rotate -1 should give the correct result") {
        val result = P19.rotate(-1, fixture.list)
        result should contain theSameElementsInOrderAs (List('k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j))
    }

    test("rotate negative places should give the correct result") {
        P19.rotate(-2, fixture.list) should contain theSameElementsInOrderAs (List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
    }

    test("rotate negative number whose abs is greater than or equal to list length should give correct result") {
        P19.rotate(-12, fixture.list) should contain theSameElementsInOrderAs (
            List('k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j))
        P19.rotate(-109, fixture.list) should contain theSameElementsInOrderAs (
            List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a))
    }
}


