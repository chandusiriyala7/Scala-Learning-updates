package Lectures.part2oops

object OOBasics extends App {
  val person = new Person("Chandu ",20)
  println(person.x)
  person.greet("Chandusiriyala")
}

class Person(name : String ,val age : Int) {
  val x = 7

  println(1+3)


  def greet(name:String): Unit = println(s"${this.name} says : Hi, $name")

}


//Class Parameters are Not Fields