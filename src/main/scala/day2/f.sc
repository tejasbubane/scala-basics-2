// PATTERN MATCHING

case class Address(line1: String)
case class Person(name: String, age: Int, address: Address)

def size(obj: Any) = obj match {
  case 1 => 1 // constant pattern
  case 2 | 3 => 6  // or pattern
  case "abc" => 3
  case (1, "abc") => 4
  case x: Int if x > 100 => 100
  case x: Int => x
  case x: String if x.length > 4 => 40
  case (x, y: String) => 22
  case (x, inner @ (3, "aaa", y)) => inner
  case Person(name, age, Address(l1)) => l1.length
}

// we can obviously match over multiple params
/*
def size(obj1: Any, obj2: Any) = (obj1, obj2) match {
  case (<tuple>) =>

  // all cases will have tuple matchers

}
 */

size(1)
size(3)
size("abc")
size(12)
// size(Seq(1, 2)) // does not match any string
size(102)
size("tejas")
size(1, (3, "aaa", 4))

size(Person("tejas", 23, Address("pune")))