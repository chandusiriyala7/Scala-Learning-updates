package Lectures.part3fp

object WhatsAFunction extends App {

  //use and work with functions  as first class elements
  //problem : oop

  val doubler =  new MyFunction[Int,Int]{
    override  def apply(element:Int) : Int = element * 2
  }
  println(doubler(2))

   //function Types = Function1[A,B]
  val stringToIntConverter = new Function[String,Int] {
    override def apply(string: String):Int = string.toInt
  }

   println(stringToIntConverter("7") + 4)

   val adder : ((Int,Int) => Int)  = new Function2[Int,Int,Int] {
     override def apply(a : Int, b : Int) = a+b
   }
   // Function Types Function2[A,B,R] === (A,B) => R

   //ALL SCALA FUNCTIONS ARE OBJECTS

   /*
   1.a function which takes two strings and concatenates them
   2.transform the MyPredicate and MyTransformer into function types
   3.define a function which takes an int and returns another function which takes an int and return an int
      -Whats the type of this function
      -how to do it

    */


   def concatenator : (String , String) => String = new Function2[String,String,String] {
     override def apply(a:String, b :String ) : String = a +b
   }
   println(concatenator("Hello"," Scala"))

   //Function1[Int,Function2[Int,Int]]

   val superAdder : Function1[Int,Function1[Int,Int]] = new Function1[Int,Function1[Int,Int]] {
     override def apply(x : Int):Function1[Int,Int] = new Function1[Int,Int] {
       override def apply(y:Int) : Int = x + y
     }
   }

   val adder3 = superAdder(3)
   println(adder3(4))
   println(superAdder(3)(4))
}

trait MyFunction[A,B] {
  def apply(element:A) : B

}
