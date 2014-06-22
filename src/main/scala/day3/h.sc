// Folding Lists

val xs = (1 to 10).toList

xs.sum

def add(x: Int, y: Int) = x + y

xs.foldLeft(0)(_ + _)

xs.foldLeft(0) { (acc, elem) =>
  acc + elem
}

xs.foldLeft(List.empty[Int]) { (acc, elem) =>
  elem :: acc
}

xs.foldLeft("")(_ + _)
xs.foldRight("")(_ + _)
// why are they same for left and right?

xs.foldLeft("")((acc, elem) => acc + elem)
xs.foldRight("")((elem, acc) => acc + elem)

xs.reduceLeft(_ + _)
// Seq.empty[Int].reduceLeft(_ + _) // runtime exception
// first element is always the initial value of accumulator in reduceLeft
