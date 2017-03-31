package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by rick on 3/31/2017.
  */
@RunWith(classOf[JUnitRunner])
class P06Spec extends FlatSpec with Matchers {
    def fixture = new {
        val palindrome = List(1, 2, 3, 2, 1)
        val nonPalindrome = List(1, 2, 3, 4, 3, 1, 1)
    }

    it should "return true when meet a palindrome" in {
        P06.isPalindrome(fixture.palindrome) should be(true)
    }

    it should "return false when meet a non palindrome" in {
        P06.isPalindrome(fixture.nonPalindrome) should be(false)
    }
}
