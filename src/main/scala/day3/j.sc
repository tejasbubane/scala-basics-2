// Streams

val s = Stream.from(1) // infinite stream

s.map(x => x * x) // values ahead of first element

s.map(x => x * x).filter(_ % 2 == 0)

s.map(x => x).filter(_ % 2 == 0).drop(20).take(20).toList

// streams can be used for problems such as find first 100 prime numbers.
// write prime number function, pass along to stream then drop, take, toList