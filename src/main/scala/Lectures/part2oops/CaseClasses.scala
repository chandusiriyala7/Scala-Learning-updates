package Lectures.part2oops

object CaseClasses extends App {


  /*
  equalsn , hashcode , toString
   */

  case class Person(name : String , age : Int)

    // 1 .class Paramters are fields

    val jim = new Person("Jim",34)
    println(jim.name)

    //2 . Sensible toString
    // println(instance) = println(instance.toString) //syntactic sugar
    println(jim.toString)

    //3.equals and hashcode implemented out of the Box (OOTB)

    val jim2 = new Person("Jim",34)
    println(jim ==jim2)


    //4 . case classes have handy copy method
    val jim3 = jim.copy(age = 45)
    println(jim3)

    //5.case classes have companion objects

    val thePerson = Person
    val mary = Person("Mary",23)


    //6.Case classes are serializable
    //Akka Framework
    //7. Case classes have extractor patterns = Case classes can be used in pattern matching

    case object UnitedKingdom {
      def name : String = "The Uk of GB and NI"
    }

    /*
    Expand MyList - use case classes and case objects
     */

}
