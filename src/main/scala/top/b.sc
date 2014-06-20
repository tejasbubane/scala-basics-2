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