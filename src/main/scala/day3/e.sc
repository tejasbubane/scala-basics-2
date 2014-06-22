case class Book(author: String, name: String, basePrice: Int)

val book1 = new Book("odersky", "Scala 1", 550)
val book2 = new Book("odersky", "Scala 2", 350)
val book3 = new Book("hickey", "Clojure 1", 450)
val book4 = new Book("mickey", "Functional Prog", 450)

val books = Seq(book1, book2, book3, book4)

books.map(_.author)
books.filter(_.author == "odersky")
books.filter(_.author == "odersky").length

books.map(_.basePrice)
books.map(_.basePrice).sum

def totalPrice(b: Seq[Book]) = b.map(_.basePrice).sum

books.groupBy(_.author)
books.groupBy(_.author).mapValues(bs => totalPrice(bs))

books.sortBy(_.author)
books.sortBy(b => (b.author, b.basePrice)) // sort by author and then by basePrice
books.sortWith(_.author > _.author)

// cannot do one ascending and one descending directly

val ord = new Ordering[Book] {
  def compare(book1: Book, book2: Book) = ???
}
 // books.sorted(ord) new ordering defined and passed to sorted