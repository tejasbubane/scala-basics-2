// PATTERN MATCHING

def size(obj: Any) = obj match {
  case 1 => 1 // constant pattern
  case 2 | 3 => 6  // or pattern
  case "abc" => 3
  case (1, "abc") => 4
  case x: Int if x > 100 => 100
  case x: Int => x
  case x: String if x.length > 4 => 40
  case (x, y: String) => 22
  case (x, inner @ (3, "aaa", y)) => inner
}

size(1)
size(3)
size("abc")
size(12)
// size(Seq(1, 2)) // does not match any string
size(102)
size("tejas")
size(1, (3, "aaa", 4))