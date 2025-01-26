package Lectures.part2oops

object Objects extends App {
    //SCALA DOES NOT KNOW THE CONCEPT CLASS LEVEL FUNCTIONALITY
  object Person {
      val N_EYES = 2
      def canFly : Boolean = false

      //factory method
      def apply(mother:Person,father:Person):Person = new Person("Bobby")
    }

  class Person (val name : String){
    //instance level functionality

  }
  //COMPANIONS


    println(Person.N_EYES)
    println(Person.canFly)

    //Scala Object = SingleTon Instance

    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val bobby  = Person(mary,john)

    //Scala Applications = Scala Object With
    //def main(args : Array[String]) : Unit

}
