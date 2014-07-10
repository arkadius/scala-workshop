package ready.p08

class DeclarativeProgramming extends App {
  val ducks = List(
    Duck("Donald", "m", 20),
    Duck("Sknerus McKwacz", "m", 60),
    Duck("Della", "f", 30),
    Duck("Hyzio", "m", 5),
    Duck("Zyzio", "m", 5),
    Duck("Dyzio", "m", 5)
  )

  val adultMalesNames = findAdultMalesNames(ducks)
  println(adultMalesNames)

  def findAdultMalesNames(ducks: List[Duck]): List[String] =
    ducks
      .filter(duck => duck.isAdult && duck.isMale)
      .map(_.name)

  case class Duck(name: String, gender: String, age: Int) {
    def isMale = gender == "m"

    def isFemale = gender == "f"

    def isAdult = age >= 18
  }

}
