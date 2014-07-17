package prez2.p04

object ShapelessNoTags extends App {

  val fromDBMap = Map[String, Any]()

  def processDBRecord(record: Map[String, Any]) = {
    println(s"Record has ${record.size} fields")
  }

  val notFromDBMap = Map[String, Any](
    "Donald" -> "Duck"
  )
  processDBRecord(notFromDBMap) // woops! it's works

  // solution: case classes

  case class DBRecord(map: Map[String, Any])

  val dbRecord = DBRecord(fromDBMap)

  def processDBRecord(record: DBRecord) = {
    val fieldsCount = record.map.size
    println(s"Record has $fieldsCount fields")
  }

}
