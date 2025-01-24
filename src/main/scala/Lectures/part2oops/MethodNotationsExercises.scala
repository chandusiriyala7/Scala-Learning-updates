package Lectures.part2oops

object MethodNotationsExercises extends App {

  /*
  1. Overload the + Operator 
      mary + "the rockstar " => new person  "Mary (the rockstar)"
      
   2.Add an age to the Person Class 
      add a unary + operator => new person with the age + 1
      + mary => mary with the age incrementer

   3.Add a "Learns" method in the person class => "Mary Learns Scala "
   Add a learnsScala method , calls learns method with "Scala".
   Use it in Postfix Notation

   4.Overload the apply method
    mary.apply(2) => "Mary watched Inception 2 times"
   */

  class Person(val name: String, favouriteMovie: String , val age:Int = 0) {
    def +(nickname : String) : Person = new Person(s"$name ($nickname)",favouriteMovie)
    def apply() : String = s"Hi my name is $name and i like $favouriteMovie"
    def unary_+ : Person =  new Person(name,favouriteMovie,age+1)
    def apply(n : Int):String = s" $name watched $favouriteMovie $n times"
    def learns (thing: String) = s"$name is learning $thing"

    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  print(mary.learnsScala)
  println(mary(10))


  }
















