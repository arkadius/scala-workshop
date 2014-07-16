package prez2.p02

object ValidationsUsingExceptions extends App {

  case class Person(name: String, age: Int)

  def parseName(input: String): String = {
    val trimmed = input.trim
    if (!trimmed.isEmpty)
      trimmed
    else
      throw new IllegalArgumentException(s"$input is not a valid name")
  }

  def parseAge(input: String): Int = {
    try {
      val age = input.trim.toInt
      if (age >= 0)
        age
      else
        throw new IllegalArgumentException(s"$age is not a valid age")
    } catch {
      case _: NumberFormatException =>
        throw new IllegalArgumentException(s"$input is not a valid integer")
    }
  }

  def parsePerson(inputName: String,
                  inputAge: String): Person = {

    val name = parseName(inputName)
    val age = parseAge(inputAge)
    Person(name, age)
  }

}
