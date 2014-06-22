// Some, None and Option

val m = Map(1 -> 'a', 2 -> 'b', 3 -> 'c')

m.get(1)
m.get(2)
m.get(3)
m.get(4)

Some("asadsdaa")

case class Person(name: String)

Some(Person("abcd"))

val x: Option[Person] = Some(Person("abcd"))

val x1: Option[String] = null
// this can lead to broken code since Option refers to null


val x3: Option[String] = Option(null)