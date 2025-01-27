package Lectures.part2oops

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType : String
    def eat : Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "wild"
    def eat : Unit = println("Crunch Crunch")
  }

  //traits

    trait carnivore {
      def eat(animal : Animal) : Unit
      val preferredMeal : String = "fesh meat"

    }

    trait ColdBlooded

    class Crocdile extends Animal with carnivore with ColdBlooded {
      override val creatureType: String = "croc"
      def eat : Unit = println("nonnonnonm")
      def eat(animal:Animal) : Unit = println(s"i am croc and i am eating ${animal.creatureType}")
    }



  val dog = new Dog
  val croc = new Crocdile
    croc.eat(dog)

  // traits vs abstract classes
   // 1. traits do not have parameters
    //2. multuple triats can be inherited by same class
    //3. traits = behaviour
}
