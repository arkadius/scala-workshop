package ready.p05

class Factorial extends Function1[Int, Int] {
  def apply(n: Int): Int =
    if (n <= 1)
      1
    else
      n * new Factorial().apply(n-1)
}

object Factorial extends App {
  val factorialFunction = new Factorial()
  val factorialFor3 = factorialFunction.apply(3)
  println(s"Factorial for 3: $factorialFor3")

  printAFewValuesFor(factorialFunction)

  def printAFewValuesFor(fun: Function[Int, Int]) = {
    println(s"f(0) = ${fun(0)}")
    println(s"f(1) = ${fun(1)}")
    println(s"f(2) = ${fun(2)}")
    println(s"f(3) = ${fun(3)}")
    println(s"f(10) = ${fun(10)}")
  }
}