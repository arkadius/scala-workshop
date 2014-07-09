package ready.p03

object MoreObjective extends App {
  val named: Named = new Duck("Donald")
  println(named.name)

  abstract class Named {
    var name: String
  }

  class Duck extends Named {
    var name: String = null

    def this(name: String) {
      this()
      this.name = name
    }
  }

}