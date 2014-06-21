class Person(val name: String, val age: Int)

new Person("aa", 10)
new Person("aa", 10)
// though objects are same, hash-codes will be different

// Introduce "case class"
case class Person1(name: String, age: Int) // no need for val args

new Person1("aa", 10).hashCode()
new Person1("aa", 10).hashCode()
// same hashcode

new Person1("aabb", 20).name
new Person1("aabb", 20).age
// has getter methods

val p = new Person1("aa", 10)
p.copy() // default values of this
p.copy(age = 100) // new copy with different age

case class Address(line1: String)
case class Person2(name: String, age: Int, address: Address)

val p1 = new Person2("tejas", 23, Address("mumbai"))
p1.copy()
p1.copy(address = Address("pune"))
p1.copy(age = 40)

/* use case class only when the whole identity of class is defined by
   only by args to constructor and nothing else
 */

// This approach is called "copy-on-write"
// heavily used approach
// copy() is doing deep copy


