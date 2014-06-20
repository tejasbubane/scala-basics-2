// no need of strategies

class Person(age: Int, isFemale: Boolean) {
  def isWise: Boolean = if(isFemale) age > 18 else age > 21
  def canMarry(canDrink: Int => Boolean) =
    isWise && canDrink(age)
}

//////////

def canDrink(age: Int) = age > 50  // method

val canDrink1 = { age: Int => age > 50 } // function
// functions by very nature are objects hence they are VALUES

canDrink(10)

canDrink1(10)
canDrink1.apply(10)

canDrink1 // val Int => Boolean = <function1>
canDrink _ // eta-expansion : convert this method to a function

val x: Int => Boolean = canDrink