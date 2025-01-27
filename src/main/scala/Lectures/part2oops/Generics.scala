package Lectures.part2oops

object Generics extends App {

  class MyList[+A] {
    //use the type A
    def add[B >:A](element : B) : MyList[B] = ???

    /*
    A = Cat
    B = Animal
     */
  }
  class MyMap[key,value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A] : MyList[A] = ???

  }

  val emptyListofIntegers = MyList.empty[Int]

  //variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //List[cat] extends List[Animal] = Covariance

  class CovariantList[+A]
  val animal : Animal = new Cat
  val animalList:CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ??? HARD => We request List of Animals

  //INVARIANCE

  class InvariantList[A]
  val InvariantAnimalList : InvariantList[Animal] = new InvariantList[Animal]


  // CONTRAVARIANT

  class Trainer[-A]
  val trainer : Trainer[Cat] = new Trainer[Animal]


  //bounded types

  class Cage[A <: Animal](animal: A)
  val cage =  new Cage(new Dog)

  class Car
  val newCage = new Cage(new Cat)


  //expand myList to be Generic

}