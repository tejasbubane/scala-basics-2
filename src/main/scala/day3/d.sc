// SCALA COLLECTIONS

// 1. Sequences
Seq(1, 2, 3)
Seq.apply(1, 2, 3) // apply takes variable number of arguments

// normal program
def m(a: Seq[Int])= a.sum
m(Seq(1, 2, 3, 4))

// var-args
def m1(a: Int*) = a.sum
m1(1, 2, 3, 4)

def m2(a: Int*) = a.product
// def m3(a: Int*) = m2(a) // cannot pass sequence
// though we take in var-args, handle we get is a sequence which we cannot pass around

def m3(a: Int*) = m2(a: _*) // splat into var-args

// Default way of creating collections, no special syntax
Seq(1,2,3,4)
Iterable(1,2,3,4)
Set(1,2,3,4)
IndexedSeq(1,2,3,4)

// by default all collections are immutable
val xs = Seq(1,2,3,4,5)
// all below transformation functions return a new immutable collection
xs.take(4)
xs.drop(4)
xs.splitAt(4)
val (firstFour, rest) = xs.splitAt(4) // pattern match
firstFour
rest

val ys = Seq(7,5,2,9,6,3,1,5)
ys.filter(_ > 4)
ys.filterNot(_ > 4)
ys.partition(_ > 4)

ys.takeWhile(_ <= 8) // take while condition is true
// takewhile will not traverse the whole iterable collection
// filter will always traverse whole collection
ys.dropWhile(_ <= 8)
ys.span(_ <= 8)

// Map: The most famous operation on Sequences
xs.map(_ * 2)
ys.map(_ + 10)