object E {
  trait Person {
    def age: Int
    val x = 0
  }

  class Indian extends Person {
    override val x = 88
    def age = {println("Indian"); 100} // side-effect
  }

  class American extends Person {
    override val x = 99
    def age = {println("American"); 90} // side-effect
  }

  val indian: Person = new Indian
  val american = new American

  indian.age
  american.age

  indian.x
  american.x

}