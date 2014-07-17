package prez2.p04

object ShapelessTags extends App {

  val fromDBMap = Map[String, Any]()

  import shapeless.tag
  import shapeless.tag._

  trait DBRecordTag

//  def processDBRecord(record: Map[String, Any] @@ DBRecordTag) = {
//    println(s"Record has ${record.size} fields")
//  }

  // using type aliases

  type DBRecord = Map[String, Any] @@ DBRecordTag

  def processDBRecord(record: DBRecord) = {
    println(s"Record has ${record.size} fields")
  }

  val notFromDBMap = Map[String, Any](
    "Donald" -> "Duck"
  )

//  processDBRecord(notFromDBMap)  // compile error

  def DBRecord(map: Map[String, Any]) = tag[DBRecordTag](fromDBMap)

  val dbRecord = DBRecord(fromDBMap)

  processDBRecord(dbRecord)

}