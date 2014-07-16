package prez2.p03

import scala.concurrent.Future
import scala.util.Try

object AsyncOnFuture extends App {

  import scala.concurrent.ExecutionContext.Implicits.global

  case class Person(name: String, age: Int)

  object DB {
    def insert(person: Person) = ???
  }

  object PersonDao {
    def savePerson(person: Person): Future[Boolean] = {
      Future {
        DB.insert(person)
        true
      } recover {
        case _:Exception => false
      }
    }
  }

  object Presenter {
    def presentPersonSaved(person: Person, saved: Boolean): Future[Unit] = ???
  }

  val person = Person("Ala", 18)

  for {
    saved <- PersonDao.savePerson(person)
    _     <- Presenter.presentPersonSaved(person, saved)
  } {
    println("Yupi! Operation finished.")
  }
}
