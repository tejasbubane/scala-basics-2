// Object Oriented in Scala

class Person(private var _age: Int, name: String) {
  // we usually don't use private var in constructor

  println("outer")
  val x = 10

  {
    println("inner")
    val x = 90
    println(x)
  }

  def age = _age // getter
  def age_=(other: Int)= _age = other  // setter
}
val p = new Person(23, "tejas")
p.age = 100