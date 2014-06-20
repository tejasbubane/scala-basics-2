
object D {

  trait Item {
    def name: String
    def cost: Double
    def imported: Boolean
    def taxes: Taxes

    def total_cost: Double = {
      val sales_tax_value = get_tax(cost, taxes.sales_tax)
      val import_duty_value =
        if (imported) get_tax(cost, taxes.import_duty)
        else 0.0
      cost + sales_tax_value.floor + import_duty_value.ceil
    }

    def get_tax(cost: Double, tax: Double) = cost * tax / 100
  }
  trait Taxes {
    def sales_tax: Double
    def import_duty: Double
  }

  object Book extends Taxes {
    val sales_tax = 10.4
    val import_duty = 9.4
  }

  class Book(val name: String, val cost: Double, val imported: Boolean) extends Item {
    override def taxes: Taxes = Book
  }

  object Medicine extends Taxes {
    val sales_tax = 2.7
    val import_duty = 10.1
  }
  class Medicine(val name: String, val cost: Double, val imported: Boolean) extends Item {
    override def taxes: Taxes = Medicine
  }

  val Book1 = new Book("Book1", 120, false)
  val Book2 = new Book("Book2", 1004, true)
  val Book3 = new Book("Book3", 87.8, false)
  val Medicine1 = new Medicine("Medicine1", 503.3, false)
  val Medicine2 = new Medicine("Medicine2", 19.3, false)

  Book1.total_cost
  Book2.total_cost
}