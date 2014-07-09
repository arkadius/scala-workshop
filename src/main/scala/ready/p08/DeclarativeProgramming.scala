package ready.p08

class DeclarativeProgramming extends App {
  val ducks = List(
    new Duck("Donald", "m", 20),
    new Duck("Sknerus McKwacz", "m", 60),
    new Duck("Della", "f", 30),
    new Duck("Hyzio", "m", 5),
    new Duck("Zyzio", "m", 5),
    new Duck("Dyzio", "m", 5)
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
