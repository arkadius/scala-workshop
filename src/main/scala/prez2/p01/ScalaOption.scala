package prez2.p01

object ScalaOption extends App {

  val noneInt = Option.empty[Int]
  val someInt = Some(123)

  println(usingIfGetSequence(noneInt))
  println(usingIfGetSequence(someInt))

  println(usingTransform(noneInt))
  println(usingTransform(someInt))

  def usingIfGetSequence(optionalInt: Option[Int]): Option[Int] = {
    if (optionalInt.isDefined) {
      Some(optionalInt.get * 2)
    } else {
      None
    }
  }

  def usingTransform(optionalInt: Option[Int]): Option[Int] = {
    optionalInt.map { input => input * 2 }
  }

  Option

}
