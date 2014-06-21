
trait A { me: B =>
  def m2 = m1 + 10
}

trait B { me: A =>
  def m1 = 99
}

// solving cyclic dependency problem
// me: B => ... (lambda syntax) instead of extends

// new A{} // this still does not work
new A with B  // but this works!