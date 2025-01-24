package Lectures.part1basics

object Recursion extends App {
  def factorial(n : Int) : Int = {
    if (n <= 1) 1
    else {
      println("Computing Factorial of "+ n + "- I first need computed factorial of" + (n-1))
      val result  = n * factorial(n-1)
      println("Computed Factorial of " + n)
result }
  }
  
  //println(factorial(10))
  
  def anotherFactorial(n : Int):BigInt = {
    def factHelper(x:Int,accumulator:BigInt):BigInt =  {
      if(x <= 1) accumulator
      else factHelper(x-1,x*accumulator)

    }
    factHelper(n,1)
  }
 //println(anotherFactorial(500))

  def concatenateTailrec(aString: String,n : Int,accumulator : String ):String = {
    if(n<=0) accumulator
    else concatenateTailrec(aString,n-1,accumulator+aString)
  }

  println(concatenateTailrec("Chandusiriyala",7,""))

}

