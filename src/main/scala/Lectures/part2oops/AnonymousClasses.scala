package Lectures.part2oops

object AnonymousClasses extends App {

  abstract class Animal  {
    def eat : Unit
  }

  // anonymous class
  val funnyAnimal : Animal = new Animal {
    override def eat: Unit = println("hahahahahahahahah")
  }
  /*
  equivalent with b
  class AnonymousClasses$$anon$1 extends Animal {
  override def eat : Unit = println("ahaahaahahahaa")
  }

  val funnyAnimal : Animal = new AnonymousClasses$$anon$1
   */
  println(funnyAnimal.getClass)

  class Person(name : String) {
    class Person(name : String) {
      def sayHi : Unit = println(s"Hi my name is $name,how can i help?")
    }

    val jim = new Person("Jim") {
      override  def sayHi : Unit = println(s"Hi my name is $name , how can i help?")
    }
  }
}
