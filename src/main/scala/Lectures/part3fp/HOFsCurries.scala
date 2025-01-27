package Lectures.part3fp

object HOFsCurries extends App {

  // Higher-order function (HOF)
  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = (n, func) => {
    (x: Int) => {
      val result = func("test", (y: Int) => y > 5) // Just a sample predicate: checks if the number is greater than 5
      x + result // Add the result of func to the input x
    }
  }

  // Example usage of superFunction
  val myFunc: (String, (Int => Boolean)) => Int = (s: String, pred: Int => Boolean) => {
    if (pred(3)) 10 else 0 // Checks if 3 satisfies the predicate (3 > 5 is false, so it returns 0)
  }

  val result = superFunction(5, myFunc)(1) // Here we apply superFunction with n = 5 and the myFunc function
  println(result) // This will print: 1 (since func returns 0, so 1 + 0 = 1)

  // Curried function example: superAdder
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y

  // Create a function by fixing x to 3
  val add3 = superAdder(3) // add3 is now a function that adds 3 to its input

  // Use add3 to add 3 to 10
  println(add3(10)) // This will print: 13

  // function that applies a function n times over a value x
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1)) // This will print 11 (plusOne applied 10 times on 1)

  // Improved version of nTimes that returns a function rather than computing the result immediately
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1)) // This will also print 11 (as it's applying plusOne 10 times)


/*
 // Curried Functions
     val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y

    // Create a function by fixing x to 3
     val add3 = superAdder(3) // add3 is now a function that adds 3 to its input
    println(add3(10))

    // functions with multiple parameter lists

    def curriedFormatter(c: String)(x: Double): String = c.format(x)

    val standardFormat: (Double => String) = curriedFormatter("%4.2f")
    val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

    println(standardFormat(Math.PI))
    println(preciseFormat(Math.PI))

*/

}