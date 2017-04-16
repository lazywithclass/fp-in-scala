package exercises

object chapter_3 {

  def main(args: Array[String]): Unit = {

  }

  // exercise 3.1
  // `case Cons(x, Cons(2, Cons(4, _)))` is not matched, `3` is missing
  // `case Nil` is not matched
  // `case Cons(x, Cons(y, Cons(3, Cons(4, _))))` matches input List(1,2,3,4,5)
  // `case Cons(h, t)` not matched because 3rd is matched (and is wrong btw)
  // `case _` not matched becase 3rd is matched

}

