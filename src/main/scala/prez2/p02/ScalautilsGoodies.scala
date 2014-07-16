package prez2.p02

import java.util.Date

import org.scalautils._

object ScalautilsGoodies extends App {

  "" == new Date() // compile

//  import TypeCheckedTripleEquals._
//  "" === new Date() // not compile

  import TripleEquals._
  import StringNormalizations._
  import Explicitly._
  ("Hello" === "hello") (after being lowerCased) // true

  import TimesOnInt._
  3 times println("hello ") // Output: hello hello hello




}
