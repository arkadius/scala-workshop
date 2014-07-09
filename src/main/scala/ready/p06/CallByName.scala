package ready.p06

object CallByName extends App {

  var i = 0
  execute { () =>
    i += 1
  }
  println(s"i after call: $i")

  def execute(fun: () => Unit) {
    fun()
  }

}
