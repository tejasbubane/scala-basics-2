package tax_assignment

/**
 * Created by tech-6 on 20/6/14.
 */
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
