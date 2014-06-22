val xs1 = 1 to 5

val xs = (1 to 5).toList

val ys = ('a' to 'e').toList

xs.map(_ + 1)

xs.map(x => ys.map(y => (x, y)))

xs.flatMap(x => Seq(x+1)) // map in terms of flatMap

xs.flatMap(x => if (x > 2) Seq(x) else Seq()) // filter in terms of flatMap

for {
  x <- xs
  if x > 4
  y <- ys
  if y != 'c'
} yield(x, y)
// yield gives a result back

xs.filter(_ > 4).flatMap { x =>
  ys.filter(_ != 'c').map { y =>
    (x, y)
  }
} // for-yield converted to flatMap-map irrespective of conditions

