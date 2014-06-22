def sqr(xs: Seq[Int]) = xs.map(x => x * x)

sqr(Seq(9))
sqr(Seq.empty)

Option(9) // Some(9
Option.empty[Int] // None

def sqr1(xs: Option[Int]) = xs.map(x => x * x)
// map is general function on any box/container type (like Option)
sqr1(Option(9))
sqr1(Option.empty[Int])

// map is operation that can be applied meaningfully on any container
// it is called "functor" -> name comes from category theory

Seq(8)
Seq(9)
Seq(9).flatMap(x => Seq(8).map(y => x+y))

def adder(xs: Seq[Int], ys: Seq[Int]) = for {
  x <- xs
  y <- ys
} yield x + y

adder(Seq(8), Seq(9))

def adder1(xs: Option[Int], ys: Option[Int]) = for {
  x <- xs
  y <- ys
} yield x + y

adder1(Option(8), Option(9))
/* for loop don't work on any container
    they compile to flatMap and map which in turn work on any container
 */
// general concept of flatMap is called "monads"
