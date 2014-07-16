package prez2.p02

object ValidationsUsingOptions extends App {

  case class Person(name: String, age: Int)

  def parseName(input: String): Option[String] = {
    val trimmed = input.trim
    if (!trimmed.isEmpty)
      Some(trimmed)
    else
      None
  }

  def parseAge(input: String): Option[Int] = {
    try {
      val age = input.trim.toInt
      if (age >= 0) Some(age) else None
    }
    catch {
      case _: NumberFormatException =>
        None
    }
  }

  def parsePerson(inputName: String,
                  inputAge: String): Option[Person] = {

    parseName(inputName).flatMap { name =>
      parseAge(inputAge).map { age =>
        Person(name, age)
      }
    }
  }

}