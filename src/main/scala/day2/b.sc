
trait A extends B {
  def m2 = m1 + 10
}

trait B extends A {
  def m1 = 99
}

// cannot have cyclic dependency
new A{}
new A with B