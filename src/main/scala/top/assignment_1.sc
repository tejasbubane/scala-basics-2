// implementation of map function using loop and mutations

val seq: Seq[Int] = Seq(1, 2, 3, 4, 5)

def transform[T, S](seq: Seq[T], f: T => S): Seq[S] = {
  var a: Seq[S] = Seq.empty
  val iterator = seq.iterator
  while(iterator.hasNext) {
    a = a :+ f(iterator.next())
  }
  a
}

transform[Int, Int](seq, x => x * 7)

transform[Int, Int](Seq(1, 2, 3), x => x * x)

transform[Int, Boolean](seq, {x: Int => (x == 2 || x == 3)})