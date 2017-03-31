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


