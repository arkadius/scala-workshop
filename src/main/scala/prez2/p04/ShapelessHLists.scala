package prez2.p04

object ShapelessHLists extends App {

  import shapeless._

  object Animal extends Enumeration {
    val Cat, Dog, Duck = Value
  }
  import Animal._

  type Sentence = String :: _ :: Int :: Animal.Value :: HNil

  val sentences = List[Sentence](
    "Ala" :: "has" :: 5 :: Cat :: HNil,
    "Bela" :: "has" :: 1 :: Dog :: HNil,
    "Cela" :: "has" :: 1000 :: Duck :: HNil
  )

  println(recognizeAnimalFreaks(sentences))
  // out: List(Ala, Cela)

  def recognizeAnimalFreaks(sentences: List[Sentence]): List[String] = {
    sentences map { sentence =>
      val who :: _ :: countOfAnimals = sentence
      val isCrazy = isCrazyTooManyAnimals(countOfAnimals)
      (who, isCrazy)
    } collect {
      case (who, true) => who
    }
  }

  def isCrazyTooManyAnimals(countOfAnimals: Int :: Animal.Value :: HNil) = countOfAnimals match {
    case count :: Animal.Cat  :: HNil if count > 2 => true
    case count :: Animal.Dog  :: HNil if count > 5 => true
    case count :: Animal.Duck :: HNil if count > 100 => true
    case _ => false
  }

}
