package prez2.p04

import org.scalatest._
import java.io._

class WithFixtureSpec extends fixture.FlatSpec with Matchers {
  case class FixtureParam(file: File, writer: FileWriter)

  def withFixture(test: OneArgTest) = {
    // create the fixture
    val file = File.createTempFile("hello", "world")
    val writer = new FileWriter(file)
    val theFixture = FixtureParam(file, writer)

    try {
      writer.write("ScalaTest is ") // set up the fixture
      withFixture(test.toNoArgTest(theFixture)) // "loan" the fixture to the test
    } finally {
      writer.close() // clean up the fixture
    }
  }

  it should "be easy" in { f =>
    f.writer.write("easy!")
    f.writer.flush()
    f.file should have length 18
  }
}
