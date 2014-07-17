package prez2.p04

object ShapelessRecords {

  import shapeless._
  import syntax.singleton._
  import record._

  object Type extends Enumeration {
    val Duck, Human = Value
  }

  val map =
    ("id"   ->> 123) ::
    ("name" ->> "Donald") ::
    ("type" ->> Type.Duck) ::
    HNil


  val v: Int = map("id")
//  val v2 = map("whatever") // not compile

}
