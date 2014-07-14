package prez1.p04

object Factories extends App {
  val donald: Duck = DonaldDuck()
  System.out.println(donald.name)

  case class Duck(name: String)

  object DonaldDuck {
    def apply(): Duck = new Duck("Donald")
  }
}
