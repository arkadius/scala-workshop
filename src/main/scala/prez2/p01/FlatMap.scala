package prez2.p01

object FlatMap extends App {

  val listOfLists = List(1, 2, 3).map { i =>
    List(i, i*2)
  }
  // so maybe join these two things?
  val listOfListsRes: List[List[Int]] = List(List(1, 2), List(2, 4), List(3, 6))

  val flattenListOfLists = listOfLists.flatten
  val flattenListOfListsRes: List[Int] = List(1, 2, 2, 4, 3, 6)

  val flattenListOfLists2 = List(1, 2, 3).flatMap { i =>
    List(i, i*2)
  }
  val flattenListOfLists2Res: List[Int] = List(1, 2, 2, 4, 3, 6)

}
