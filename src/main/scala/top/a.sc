class A[T1, T2](a: T1, b:T2)

val a: A[Int, String] = new A(1, "aa")
val a1: Int A String = new A(1, "aa")

type ====>[T1, T2] = Function1[T1, T2] //type alias

val allAges = new Function1[Int, Boolean] {
  def apply(age: Int) = true
}
val gujSt = new Function1[Int, Boolean] {
  def apply(age: Int): Boolean = false
}
val mahSt: Int => Boolean = { age: Int => age > 30 } // lambda syntax

class Person(age: Int, isFemale: Boolean) {
  def isWise: Boolean = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: Function1[Int, Boolean]) =
    isWise && canDrink(age)
}

val p = new Person(19, true)
p.isWise
p.canMarry(allAges)
p.canMarry(gujSt)
p.canMarry(mahSt)