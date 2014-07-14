package prez1.p02

object SafeOptions extends App {

  val someValue = Some(1)

  val noneValue: Option[Int] = None

  printOptional(someValue)
  printOptional(noneValue)

  def printOptional(optionalValue: Option[Int]) = {
    if (optionalValue.isDefined)
      System.out.println(optionalValue.get)
    else
      System.out.println("Nothing to print")
  }

}
