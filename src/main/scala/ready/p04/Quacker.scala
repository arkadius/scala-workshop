package ready.p04

import Constants._

import scala.util.Random

object Quacker extends App {

  randomQuack()

  def randomQuack() {
    val begin = "Qu"
    val middle = prepareMiddle()
    val end = "ck"

    println(begin + middle + end)
  }

  def prepareMiddle() = {
    val randomVolume = 1 + new Random().nextInt(MAX_QUACK_VOLUME_DB)

    val middleSeq = for {
      i <- 1 to randomVolume
    } yield "a"

    middleSeq.mkString
  }

}
