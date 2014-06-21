package tax_assignment

/**
 * Created by tech-6 on 20/6/14.
 */
object BookObject {

  object Book extends Taxes {
    val sales_tax = 10.4
    val import_duty = 9.4
  }

  class Book(val name: String, val cost: Double, val imported: Boolean) extends Item {
    override def taxes: Taxes = Book
  }

}
