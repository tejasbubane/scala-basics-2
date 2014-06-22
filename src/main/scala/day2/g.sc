object D {

  // extractors
  object @@ {
    def unapply(s: String): Option[(String, String)] = s.split("@") match {
      case Array(pre, post) => Some((pre, post))
      case _ => None
    }
    def apply(pre: String, post: String) = s"$pre@$post"
  }
  @@("tejasbubane", "gmail.com")

  "tejasbubane@gmail.com" match {
    case @@(pre, _) => pre
    case x          => x
  }


  case class Person(age: Int)

  val p = Person(100)

  val Person(age) = p
  age
  // decoupling -> age is coming out of the pattern
  // every val assignment is basically a pattern-match
}


/* CASE CLASSES

  INSTANCE
    getters
    hashcode
    toString
    copy
    equals

  SINGLETON
    extractor

*/

// pattern matching can be done on arbitrary objects