package tax_assignment

/**
 * Created by tech-6 on 20/6/14.
 */
object MedicineObject {

  object Medicine extends Taxes {
    val sales_tax = 2.7
    val import_duty = 10.1
  }
  class Medicine(val name: String, val cost: Double, val imported: Boolean) extends Item {
    override def taxes: Taxes = Medicine
  }

}
