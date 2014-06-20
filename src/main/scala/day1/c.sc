// Object Oriented in Scala

class Person(val age: Int)(name: String) {}

val p = new Person(34)("ashoka")

// p.age = 10 // This will be compile time error, reassignment not allowed

p.age

val p1 = new Person(13)(_)
p1("tejas")