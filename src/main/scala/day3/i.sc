// more collection operators

val xs = Seq(9, 8, 2)

xs.exists(_ > 8)

xs.forall(_ > 8)
xs.forall(_ > 1)

Seq.empty[Int].forall(_ > 100)

Option(9).exists(_ > 18)
Option(9).forall(_ > 8)

Option.empty[Int].exists(_ > 3)
Option.empty[Int].forall(_ > 5)
// forall for expty returns true


// cons operators with Nil
1 :: 2 :: 3 :: Nil

Nil.::(3).::(2).::(1) match {
  case head :: tail => head + 1
}