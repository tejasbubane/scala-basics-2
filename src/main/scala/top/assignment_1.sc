// implementation of map function using loop and mutations

val seq: Seq[Int] = Seq(1, 2, 3, 4, 5)

// reference is mutable, data structure is immutable
def transform[T, S](seq: Seq[T])(f: T => S): Seq[S] = {
  var a: Seq[S] = Seq.empty
  val iterator = seq.iterator
  while(iterator.hasNext) {
    a = a :+ f(iterator.next())
  }
  a
}

// recursive implementation
def transform_rec[T, S](seq: Seq[T])(f: T => S): Seq[S] = {
  if (seq.isEmpty)
    Seq.empty[S]
  else
    f(seq.head) +: transform_rec(seq.tail)(f)
}
transform_rec(seq)(x => x * 7)
transform_rec(Seq(1, 2, 3))(x => x * x)
transform_rec(seq)({x: Int => (x == 2 || x == 3)})
