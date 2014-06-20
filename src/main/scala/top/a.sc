// no need of strategies

class Person(age: Int, isFemale: Boolean) {
  def isWise: Boolean = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: Int => Boolean) =
    isWise && canDrink(age)
}

val p = new Person(19, true)
p.isWise
val canDrink: Int => Boolean = { age => age > 30 }

p.canMarry(canDrink)
// OR
p.canMarry(_ > 30) // i don't care to give arguments a name
// OR
p.canMarry(age => age > 30)