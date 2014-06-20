val t = System.nanoTime()
t

def m(x: Long) = x + x
def long = {println(10); 10}
m(long)
def m1(x: => Long) = {x + x} // :=> means lazy evaluation
m1(long) // prints 10 twice
// evaluated each time value is needed
def While(cond: => Boolean)(body: => Unit): Unit = if(cond) {
  body
  While(cond)(body)
}

var x = 0
While(x < 10)({
  println(x)
  x = x + 1
})
// Partial evaluation of functions
def add(a: Int)(b: Int)(c: Int) = a + b + c
val a = add(4) _
val b = a(4)
val c = b(4)
// tuples
val xs = Seq(1, 2, 3, 4, 5)
val (greater, smaller) = xs.partition(_ > 3)
greater
smaller