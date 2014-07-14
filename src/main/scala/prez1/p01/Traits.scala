package prez1.p01

object Traits extends App {

  val donald = new DonaldDuck
  donald.quack()

  class DonaldDuck extends Named with Quacking {
    def name = "Donald"
  }

  trait Named {
    def name: String
  }

  trait Quacking { self: Named =>
     def quack() {
       println(s"${self.name}: quack")
     }
  }
}
