package ready.p01

object LessBoilerplate extends App {

  val duck = new Duck()
  duck.quack()

  val eatCockroach = duck doesEat "cockroach"
  println(s"duck eat cockroach: $eatCockroach")

  val eatEarthworm = duck doesEat "earthworm"
  println(s"duck eat earthworm: $eatEarthworm")

  duck eat "earthworm"
  duck.eat("cockroach", productionMode = true)

  class Duck {

    def quack() {
      println("Quack")
    }

    def doesEat(worm: String) =
      if (worm == "earthworm")
        true
      else
        false

    def eat(worm: String, productionMode: Boolean = false) {
      if (worm == "earthworm")
        println("Yummy")
      else if (!productionMode)
        throw new Exception("Can't eat this")
      else
        println("Good enough")
    }

  }

}