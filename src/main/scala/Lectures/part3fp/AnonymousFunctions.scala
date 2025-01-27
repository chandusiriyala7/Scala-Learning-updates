package Lectures.part3fp

object  AnonymousFunctions extends App {

  //anonymous function
  val doubler: Int => Int = (x: Int) => x * 2

  //multiple params in a lamda

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no params

  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) //function itself
  println(justDoSomething()) //call

  //curly braces with lamdas
  val stringToInt = { (str: String) =>
    str.toInt

  }
  //MOAR syntactic sugar

  val niceIncrementer: Int => Int = _ + 1 //equivalent to x = x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b


  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))


}