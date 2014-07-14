package prez1.p06

object Lambda extends App {

  var i = 0
  execute { () =>
    i += 1
  }
  println(s"i after call: $i")

  def execute(fun: () => Unit) {
    fun()
  }

}
