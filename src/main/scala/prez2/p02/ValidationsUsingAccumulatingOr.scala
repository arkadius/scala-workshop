package prez2.p02

import org.scalautils._

object ValidationsUsingAccumulatingOr extends App {

  implicit def orToAccumulating[T](or: T Or ErrorMessage) = or.accumulating

  case class Person(name: String, age: Int)

  import Accumulation._

  def parseName(input: String): String Or ErrorMessage = {
    val trimmed = input.trim
    if (!trimmed.isEmpty)
      Good(trimmed)
    else
      Bad(s"$input is not a valid name")
  }

  def parseAge(input: String): Int Or ErrorMessage = {
    try {
      val age = input.trim.toInt
      if (age >= 0) Good(age) else Bad(s"$age is not a valid age")
    }
    catch {
      case _: NumberFormatException =>
        Bad(s"$input is not a valid integer")
    }
  }

  def parsePerson(inputName: String,
                  inputAge: String): Person Or Every[ErrorMessage] = {

    val name = parseName(inputName)
    val age = parseAge(inputAge)
    withGood(name, age) { Person(_, _) }
  }

}
