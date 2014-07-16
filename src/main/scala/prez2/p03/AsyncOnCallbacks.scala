package prez2.p03

import scala.util.Try

object AsyncOnCallbacks extends App {

  case class Person(name: String, age: Int)

  object DB {
    def insert(person: Person) = ???
  }

  object PersonDao {
    def savePerson(person: Person, afterSaveCallback: Boolean => Unit) {
      try {
        DB.insert(person)
        afterSaveCallback(true)
      } catch {
        case _:Exception => afterSaveCallback(false)
      }
    }
  }

  object Presenter {
    def presentPersonSaved(person: Person,
                           saved: Boolean,
                           afterPresentCallback: => Unit): Unit = ???
  }

  val person = Person("Ala", 18)

  PersonDao.savePerson(person, (saved) =>
    Presenter.presentPersonSaved(person, saved, {
      println("Yupi! Operation finished.")
    })
  )

}
