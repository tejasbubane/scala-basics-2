
trait A {
  def m1: Int
  def m2 = m1 + 10
}
trait B {
  def m1 = 100
  def m2: Int
}

// new A  // cannot instantiate
// new B  // cannot instantiate

new A with B // can instantiate since all methods are concrete
new B with A
// trait can be instantiated only if all methods are concrete
// traits are namespace mergings


class C1 extends A with B
new C1 with A with B
class C2 extends B with A

val c: C1 = new C1
val c1: A = new C1
val c2: B = new C1
val c3: A with B = new C1
val c4: B with A = new C1
