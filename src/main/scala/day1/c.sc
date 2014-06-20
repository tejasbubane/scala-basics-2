// Object Oriented in Scala

object D {

  class Person(val age: Int, val name: String) {

    def this(age: Int) = {
      this(age, "NoName")
    }

  }

  object Person {
    private val x = 10
    val y = 20
    def apply(s: String) = new Person(x, s)
  }

  // Person.x // inaccessible
  Person.y

  val p = new Person(100, "tejas")
  p.age

  Person: Person.type
  p: p.type  // type can be called on any singleton (created via new or via object)
  // this shows object is very similar to new (and not class)

  class OldPerson(override val name: String)
    extends Person(60, name)

  val o = new OldPerson("anna")
  o.age
  o.name
}