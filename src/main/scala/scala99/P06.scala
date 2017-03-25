package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala.annotation.tailrec

/**
  * Created by rick on 2017/3/20.
  */
object P06 {
    @tailrec
    def isPalindrome[T](list: List[T])(implicit ord: Ordering[T]): Boolean = list match {
        case Nil => true
        case List(_) => true
        case a +: rest :+ b => a == b && isPalindrome(rest)
    }
}

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
