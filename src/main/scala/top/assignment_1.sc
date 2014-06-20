// implementation of map function using loop and mutations

val seq = Seq(1, 2, 3, 4, 5)

def transform(seq: Seq[Int], f: Int => Int): Seq[Int] = {
  var a: Seq[Int] = Seq.empty
  val iterator = seq.iterator
  while(iterator.hasNext) {
    a = a :+ f(iterator.next())
  }
  a
}

transform(seq, x => x * 7)

transform(Seq(1, 2, 3), x => x * x)