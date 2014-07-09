package ready.p04

object StaticsMoreObjective extends App {

  val utils: QuackingUtils = DuckQuackingUtils
  utils.quack()

  trait QuackingUtils {
    def quack() {
      System.out.println("Generic quack")
    }
  }

  object DuckQuackingUtils extends QuackingUtils {
    override def quack() {
      System.out.println("Duck quack")
    }
  }

}
