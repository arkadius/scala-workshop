package prez1.p07

object Immutability extends App {

  val beforeAdd = List(1, 2)
  val afterAdd = beforeAdd :+ 3

  println(s"before: $beforeAdd")
  println(s"after: $afterAdd")

  case class Duck(name: String)

  val beforeNameChange = Duck("Donald")
  val afterNameChange = beforeNameChange.copy(name = "Super")

  println(s"before: $beforeNameChange")
  println(s"after: $afterNameChange")

}