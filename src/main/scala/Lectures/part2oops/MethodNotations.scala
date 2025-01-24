package Lectures.part2oops

object MethodNotations extends App {

  class Person(val name : String , favouriteMovie : String) {

    def likes(movie :String): Boolean = movie == favouriteMovie
    def +(person : Person) :String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what is the problem"

    def isAlive : Boolean = true

    def apply() : String = s"Hi my name is $name and i like $favouriteMovie"

  }
  val mary = new Person("Mary","Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent

  // "operators in Scala

  val tom = new Person("Tom","Fight Club")

  println(mary + tom)

  //Prefix Notation

  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  // unary underscore prefix only works with  - + ~ !
  println(!mary)
  println(mary.unary_!)



  //Postfix Notation
  println(mary.isAlive)
   

  //apply
  println(mary.apply())
  print(mary())


}
