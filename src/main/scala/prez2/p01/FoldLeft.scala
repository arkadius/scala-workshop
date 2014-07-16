package prez2.p01

object FoldLeft extends App {

  case class Duck(name: String, age: Int)

  val ducks = List(
    Duck("Donald", 20),
    Duck("Hyzio", 5),
    Duck("Zyzio", 5),
    Duck("Dyzio", 5))

  val ducksAgeSum =
    ducks
      .map(_.age)
      .reduce(_ + _)

  // so why not to join them?

  val ducksAgeSum2 = ducks.foldLeft(0) { (acc, duck) =>
    acc + duck.age
  }
  val ducksAgeSum22: Int = 35

}
