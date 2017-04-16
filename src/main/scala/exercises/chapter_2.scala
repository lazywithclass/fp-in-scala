package exercises

object chapter_2 {

  def main(args: Array[String]): Unit = {
    // println(fib(1)) // 1
    // println(fib(3)) // 3
    // println(fib(5)) // 8
    // println(fib(6)) // 13

    // println(isSorted(Array(1, 2, 3, 4), ordered)) // true
    // println(isSorted(Array(5, 2, 3, 4), ordered)) // false
    // println(isSorted(Array(1, 2, 3, 0), ordered)) // false
  }

  // exercise 2.1
  def fib(n: Int): Int = {

    // tail recursive
    def loop(n: Int, prev: Int, curr: Int): Int =
      if (n == 0) curr
      else loop(n - 1, curr, prev + curr)

    loop(n, 0, 1)
  }

  // exercise 2.2
  def ordered(a: Int, b: Int): Boolean = a < b

  def isSorted[A](as: Array[A], p: (A,A) => Boolean): Boolean = {

    def loop(i: Int): Boolean = {
      if (i == as.length - 1) true
      else if (!p(as(i), as(i + 1))) false
      else loop(i + 1)
    }

    loop(0)
  }

  // objects that have an `apply` method can be called as if they were methods

  // 2.3 2.4 2.5 implementations could be fully determined by the return type!

  // exercise 2.3
  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = (b: B) => f(a, b)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A) => partial1(a, f)

  // exercise 2.4
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  // exercise 2.5
  def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))

  // polymorphic higher order functions are widely applicable because they say
  // nothing about any particular domain, abstracting over a common pattern that
  // occurs in many contexts
  // ie programming in the large == programming in the small

}
