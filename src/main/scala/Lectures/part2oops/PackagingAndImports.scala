package Lectures.part2oops


// 2. A Book class, also in the same package
class Book(val title: String, val author: Writer, val yearPublished: Int)

// 3. Package Object to hold shared definitions (values, methods)
package object part2oops {
  val genre = "Programming"


}

// 4. Main object to execute the application
object PackagingAndImports extends App {
  // Create a writer instance
  val writer = new Writer("Chandusiriyala", "Rock the JVM", 2018)

  // Create a book instance using the writer
  val book = new Book("Scala for Beginners", writer, 2022)

  // Print the details using a method from the package object
  //printDetails(book)

  // 5. Importing Scala and Java classes
  import java.util.Date
  val currentDate = new Date()
  println(s"Current Date: $currentDate")

  // Importing from Scala math library
  import scala.math._
  println(s"Square root of 16 is: ${sqrt(16)}")

  // 6. Importing Scala collections
  import scala.collection.mutable.ListBuffer
  val list = ListBuffer(1, 2, 3)
  list += 4
  println(s"List after adding an element: $list")

  // 7. Default imports in Scala are automatically available:
  // - scala.Predef: Provides `println`, `identity`, `assert`, etc.
  println("This is an example of println from scala.Predef.")
}
