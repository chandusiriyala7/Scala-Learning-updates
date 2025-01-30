package Tutorials

class Strings {
    var s1 = "This is scala example"
    var s2 = "Scala Example"
    var pi = 3.14

    def show(): Unit = {
      println(s1.equals(s2))
      println(s1.compareTo(s2))
      println(s1.concat(s2))
      println(s1.substring(0,6))
      println(s"pi value $pi")

    }
}

object StringObject {
  def main(args:Array[String]) : Unit = {
    println("Chandusiriyala")

    val obj = new Strings
    obj.show()
  }
}