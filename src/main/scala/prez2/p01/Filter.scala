package prez2.p01

object Filter {

  case class Duck(name: String, age: Int)

  val ducks = List(
    Duck("Donald", 20),
    Duck("Hyzio", 5),
    Duck("Zyzio", 5),
    Duck("Dyzio", 5))

  val adultDucks = ducks.filter { duck =>
    duck.age >= 18
  }
  val adultDucks2: List[Duck] = List(Duck("Donald",20))

  // how to use for it pattern matching?

  val StartingWithDon = "Don.*".r
  val donaldAge = ducks.collect {
    case Duck(StartingWithDon(), age) => age
  }
  val donaldAge2: List[Int] = List(20)

}
