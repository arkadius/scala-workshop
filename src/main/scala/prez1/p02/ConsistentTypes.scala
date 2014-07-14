package prez1.p02

object ConsistentTypes {

  val i: Int = 1
  val listOfInts = List[Int](i)

  val b: Boolean = true
  val listOfBools = List(b)

  val arrayOfBools = Array(b)

  var seqOfBools: Seq[Boolean] = listOfBools
  seqOfBools = arrayOfBools

}
