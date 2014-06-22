/* Not all functions are total functions:
eg. division is not total function, (division may be zero */

/*

 */

val pf1: PartialFunction[String, Int] = {
  case str if str.length > 3 => 3
  case str if str.length < 0 => 0
}

val v1 = "tejas"
pf1(v1)

// pf1("aa") // this will throw match error since pattern-matching fails

pf1.isDefinedAt("aa")
// the consumer of this function will have to handle this by checking

// Partial function extends Function1, hence we can pass only one argument
// But for multiple arity, we can pass a tuple

// Haskell has no notion of arity, every function as only one argument and only one return value
// Both argument and return value can in-turn be tuple, set, etc

val pf2: PartialFunction[(String, Double), Int] = {
  case(str, d) if str.length > 3 && d < 2 => 3
}

// API will crash if it is called on a value over which it is not defined

// under-the-hood isDefinedAt does something like this
new PartialFunction[String, Int] {

  def isDefinedAt(x: String) = x.length > 3 || x.length < 0

  def apply(v1: String) =
    if(v1.length > 3) 3
    else if(v1.length < 0) 0
    else throw new MatchError()
}
// compiler figures out how to convert the cases to if branches