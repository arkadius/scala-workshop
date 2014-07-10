package ready.p09

object ImplicitParams extends App {
  contextPassingUsingImplicitParams()

  def contextPassingUsingImplicitParams() {
    implicit val currentSessionContext = SessionContext("123")
    doJobUsingStaticContext("normal")
  }

  def doJobUsingStaticContext(normalParam: String)
                             (implicit context: SessionContext) {
    goingDeeper(normalParam)
  }

  def goingDeeper(normalParam: String)
                 (implicit context: SessionContext) {

    context.sessionIdOpt.map { sessionId =>
      println("Logged.")
    } getOrElse {
      println("Not logged!")
    }
    println(s"Got: $normalParam")
  }

  case class SessionContext(sessionIdOpt: Option[String]) {

    def clearSessionId() {
      copy(sessionIdOpt = None)
    }

  }

  object SessionContext {

    def apply(sessionId: String): SessionContext = SessionContext(Some(sessionId))

  }

}
