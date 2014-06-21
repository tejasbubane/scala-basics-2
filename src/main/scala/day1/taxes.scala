/**
 * Created by tejasbubane on 21/6/14.
 */

// Solution by Mushtaq

package top

trait Item {
  def basePrice: Double
  def isImported: Boolean
}

class Book(val name: String, val basePrice: Double, val isImported: Boolean) extends Item
class Medicine(val name: String, val basePrice: Double, val isImported: Boolean) extends Item

trait Tax {
  def rate: Double
  protected def compute(basePrice: Double): Double = (basePrice * rate)/100
}

trait Rounding {
  def up(value: Double) = value.ceil
  def down(value: Double) = value.floor
}

class SalesTax(val rate: Double) extends Tax with Rounding {
  def applyTo(item: Item) = down(compute(item.basePrice))
}
class ImportDuty(val rate: Double) extends Tax with Rounding {
  def applyTo(item: Item) = if (item.isImported) up(compute(item.basePrice)) else 0.0
}

class Statement(items: Seq[Item], taxes: Seq[Tax]) {
  def compute(items: Seq[Item], taxes: Seq[Tax]): Double = ???
  def print(items: Seq[Item], taxes: Seq[Tax]): Double = ???
}