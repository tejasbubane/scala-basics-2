
// Sets
Set(1,2,3)
val set = Set(1,2,3,1,1)

// Map
Map.apply(
  (1).->('a'),
  (2).->('b')
)

val hashmap = Map((1,'a'), (2,'b'))

val seq = Seq(1, 2)

seq map hashmap

val hashmap1: Function1[Int, Char]  = Map((1,'a'), (2,'b'))

val hashmap2: Int => Char  = Map((1,'a'), (2,'b'))
// Map is a function!!

hashmap.apply(1)

set(3) // set is function from T => Boolean (existency test)

seq(1) // set is function from Int => T
seq.map(_ + 1)

set.map(_ + 1)

hashmap.map {case(k,v) => v}
hashmap.map {case(k,v) => k} // iterable

// map is generic, is implemented at one place only (see function signature in source code by C-b in intellij)
// most other functional languages including haskell have separate implementations of map for each collection
// this might be considered good practice, but is debatable. Scala chose to make it generic


// collect = filter then map
val xs = Seq(1,2,3,4,5)
xs.filter(_ > 3).map(_ + 3)

xs.collect {
  case x if x > 3 => x + 3
}

val pf1: PartialFunction[Int, Int] = {
  case x if x > 3 => x + 3
}

xs
  .filter(x => pf1.isDefinedAt(x))
  .map(x => pf1(x))