package prez2.p02

import org.scalautils._

object ValidationsUsingOr extends App {

  case class Person(name: String, age: Int)

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
                  inputAge: String): Person Or ErrorMessage = {

    for {
      name <- parseName(inputName)
      age <- parseAge(inputAge)
    } yield Person(name, age)
  }

}
