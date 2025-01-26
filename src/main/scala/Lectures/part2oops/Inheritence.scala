package Lectures.part2oops

object Inheritence extends App {

  //single class inheritance
  class Animal {
    val creatureType = "wild"
    protected def eat = println("HaahaaHaaa")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors

  class Person(name: String, age: Int) {
    def this(name:String ) = this(name,0)
  }

  class Adult(name:String,age:Int,idCard:String) extends Person (name)

  //overriding

  class Dog extends Animal {
    override val creatureType: String = "Domestic"
    super.eat
    override def eat = println("Crunch Crunch")
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)



  //Overloading Vs Overriding

  //super

  /*preventing Overrides
    1."final"  keyword - use final on member
    2. "final"  keyword - use final on the entire class
    3."sealed" keyword - seal the class - extends classes in this file and prevents extension in another classes



   */


}