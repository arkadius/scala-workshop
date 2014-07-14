package prez1.p05

object PatternMatching extends App {

  val ipString = "127.0.0.1"
  println(firstPartOfIP(ipString))

  val ipFromFactory = IPv4Address(126, 0, 0, 1)
  println(firstPartOfIP(ipFromFactory))

  val badIp = "125,0,0,1"
  println(firstPartOfIP(badIp))

  def firstPartOfIP(str: String) = str match {
    case IPv4Address(firstPart, _, _, _) => firstPart
  }

  object IPv4Address {
    def apply(a: Int, b: Int, c: Int, d: Int): String =
      s"$a.$b.$c.$d"

    def unapply(ip: String): Option[(Int, Int, Int, Int)] = {
      val tokens = ip split "\\."
      if (tokens.length == 4) {
        val intTokens = tokens.map(_.toInt)
        Some(intTokens(0), intTokens(1), intTokens(2), intTokens(3))
      } else {
        None
      }
    }
  }


}
