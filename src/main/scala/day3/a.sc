// Function composition

def square(a: Int) = (a * a).toString

def length(s: String) = s.length

val f1 = square _
val f2 = length _

def combine(a: Int) = length(square(a))
square(12)
combine(12)

// compose syntax
def f12 = f1 andThen f2 // first the effect of f1 and then effect of f2
// Note: Apply is not called for f1 or f2, unless f12 is actually called

// another composition syntax
def g12 = f2 compose f1
// note the order f2 compose f1 -> means first apply f1, take result and apply f2


f12(12)
g12(12)