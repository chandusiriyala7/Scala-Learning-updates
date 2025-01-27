package Lectures.part2oops

object Exceptions extends App {

  val x : String = null

 // println(x.length)   this will crash with a no pointer exception


  //1 . Throwing  exceptions

  //val aWeirdValue:String =throw new NullPointerException

  //throwable classes will extend the throwable class
  //Exceptions and errors are the major throwable subtypes


  //2.How to Catch Exceptions

  def getInt(withExceptions : Boolean) : Int =
    if(withExceptions) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail = try{
    //code that might throw
    getInt(true)

  }catch{
    case e : RuntimeException => println("caught  a Runtime Exception")

  }finally{
    //code will get executed not matter what
    println("finally .....")
  }

  class MyException extends Exception
  val exception = new MyException

  //throw exception

  /*
  1. Crash your program with an OutOfMemoryError
  2.Crash with SOError
  3. Pocket Calculator
      - add(x,y)
      - subtract(x,y)
      - multiply(x,y)
      - divide(x,y)

    Throw
      - OverflowException if add(x,y) exceeds Int.MAX_VALUE
      - UnderflowException if subtract(x,y) exceeds Int.MIN_VALUE
      - MathCalculationException for division by 0
   */



  //OOM
 //val array = Array.ofDim(Int.MaxValue)


  //SO
  //def infinite: Int = 1 +infinite
  //val noLimit =  infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class PocketCalculator {
    def add(x:Int,y:Int) = {
      val result = x + y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if(x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }
  }

  println(PocketCalculator.add(Int.MaxValue,10))

}
