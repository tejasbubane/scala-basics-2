val allAges = new Function1[Int, Boolean] {
  def apply(age: Int) = true
}
val gujSt = new Function1[Int, Boolean] {
  def apply(age: Int): Boolean = false
}
val mahSt = new Function1[Int, Boolean] {
  def apply(age: Int): Boolean = age > 18
}

class Person(age: Int, isFemale: Boolean) {
  def isWise: Boolean = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: Function1[Int, Boolean]) =
    isWise && canDrink(age) // apply method is invoked implicitly
}

val p = new Person(19, true)
p.isWise
p.canMarry(allAges)
p.canMarry(gujSt)
p.canMarry(mahSt)