import scala.collection.mutable.ArrayBuffer

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
// reference is immutable, data structure is mutable
def transform1[T, S](seq: Seq[T])(f: T => S): Seq[S] = {
  val a = ArrayBuffer.empty[S]
  val iterator = seq.iterator
  while(iterator.hasNext) {
    a.+=(f(iterator.next()))
  }
  a.to[List]
}

transform(seq)(x => x * 7)

transform(Seq(1, 2, 3))(x => x * x)

transform(seq)({x: Int => (x == 2 || x == 3)})

val ys = transform1(seq)({x: Int => (x == 2 || x == 3)})

ys.asInstanceOf[ArrayBuffer[Int]] += 100 // runtime exception