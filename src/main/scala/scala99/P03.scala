package scala99

/**
  * Created by rick on 2017/3/19.
  */
object P03 {
    def nth[T](n: Int, list: List[T]): T =
        if (n >= 0)
            list(n)
        else
            throw new NoSuchElementException
}


