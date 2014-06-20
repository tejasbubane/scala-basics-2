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

// tail-recursive implementation
def transform_tailrec[T, S](seq: Seq[T])(f: T => S): Seq[S] = {
  def transform_acc[T, S](seq: Seq[T], acc: Seq[S])(f: T => S): Seq[S] = {
    if (seq.isEmpty)
      acc
    else
      transform_acc(seq.tail, acc:+f(seq.head))(f)
  }
  transform_acc(seq, Seq.empty[S])(f)
}
transform_tailrec(seq)(x => x * 7)
transform_tailrec(Seq(1, 2, 3))(x => x * x)
transform_tailrec(seq)({x: Int => (x == 2 || x == 3)})
