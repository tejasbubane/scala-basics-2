trait DrinkStrategy {
  def apply(age: Int): Boolean
}

val allAges = new DrinkStrategy {
  def apply(age: Int) = true
}
val gujSt = new DrinkStrategy {
  def apply(age: Int): Boolean = false
}
val mahSt = new DrinkStrategy {
  def apply(age: Int): Boolean = age > 18
}

class Person(age: Int, isFemale: Boolean) {
  def isWise: Boolean = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: DrinkStrategy) =
    isWise && canDrink.apply(age)
}

val p = new Person(19, true)
p.isWise
p.canMarry(allAges)
p.canMarry(gujSt)
p.canMarry(mahSt)