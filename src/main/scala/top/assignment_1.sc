// implementation of map function using loop and mutations

val seq = Seq(1, 2, 3, 4, 5)

def transform[T](seq: Seq[T], f: T => T): Seq[T] = {
  var a: Seq[T] = Seq.empty
  val iterator = seq.iterator
  while(iterator.hasNext) {
    a = a :+ f(iterator.next())
  }
  a
}

transform[Int](seq, x => x * 7)

transform[Int](Seq(1, 2, 3), x => x * x)