package Lectures.part2oops

object OOBasics extends App {
  val person = new Person("Chandu ",20)
  println(person.x)
  person.greet("Chandusiriyala")
  person.greet()
}

//constructor
class Person(name : String ,val age : Int) {

  val x = 7
  println(1+3)

  //method
  def greet(name:String): Unit = println(s"${this.name} says : Hi, $name")


  //overloading

  def greet(): Unit = println(s"Hi, I am $name")


  //Not Overloading def greet() : Int = 42


  //multiple constructors
  def this(name:String ) = this(name,0)
  def this() = this("John Doe")

  

}


//Class Parameters are Not Fields