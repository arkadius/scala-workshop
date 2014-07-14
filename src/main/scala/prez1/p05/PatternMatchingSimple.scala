package prez1.p05

object PatternMatchingSimple extends App {

  val i = 123

  i match {
    case 0 | 1 => println("0 or 1")
    case n if n > 100 => println("greater than 100")
    case _ => println("other")
  }

  try {
    throwingExceptionMehtod()
  } catch {
    case _:IllegalArgumentException => println("Illegal")
    case _:RuntimeException | _:Exception => println("runtime or exception")
  }

  def throwingExceptionMehtod() {
    throw new IllegalArgumentException("because")
  }


}


