// Application of partial function

val pf1: PartialFunction[String, Int] = {
  case str if str.length > 3 => 3
}
val pf2: PartialFunction[String, Int] = {
  case str if str.length < 2 => 0
}

val pf3 = pf1.orElse(pf2)
val pf4 = pf2.orElse(pf1)

pf3("tejasbubane")
pf3("a")
// pf3("aa") // this domain is still uncovered

val f = pf3.lift  // convert partial to function
f("asasasfd")
f("a")
f("aa") // None for uncovered domain

f("asasasfd").getOrElse(0)
f("a").getOrElse(0)
f("aa").getOrElse(0)

f("asasasad").getOrElse(throw new RuntimeException) //note here it is passed by name
// if it was normal evaluation would be done before the value is passed and evaluation immediately thrown exception
// by-name parameters are used at many places