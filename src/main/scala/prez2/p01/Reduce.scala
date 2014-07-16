package prez2.p01

object Reduce extends App {

  val reduced = List(1, 2, 3).reduce(_ + _)
  val reduced2: Int = 6

  val reducedEmpty = List[Int]().reduce(_ + _)
  // Woops: java.lang.UnsupportedOperationException: empty.reduceLeft

}
