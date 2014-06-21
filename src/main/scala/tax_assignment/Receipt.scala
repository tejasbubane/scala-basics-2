package tax_assignment

/**
 * Created by tech-6 on 21/6/14.
 */
object Receipt {

  def transform[T, S](seq: Seq[T])(f: T => S): Seq[S] = {
    def transform_acc[T, S](seq: Seq[T], acc: Seq[S])(f: T => S): Seq[S] = {
      if (seq.isEmpty)
        acc
      else
        transform_acc(seq.tail, acc:+f(seq.head))(f)
    }
    transform_acc(seq, Seq.empty[S])(f)
  }

  def calculate(items: Seq[Item]): Seq[Double] = {
    transform[Item, Double](items)(item => item.total_cost)
  }

}
