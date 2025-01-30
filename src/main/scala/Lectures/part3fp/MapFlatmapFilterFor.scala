package Lectures.part3fp

object MapFlatmapFilterFor extends App {

  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("red", "green", "blue")

  val combinations = numbers.flatMap(n => chars.flatMap(c => colors.map(color => s"$c$n-$color")))
  println(combinations)

  val mappedNumbers = numbers.map(_ * 2)
  println(mappedNumbers)

  val filteredNumbers = numbers.filter(_ % 2 == 0)
  println(filteredNumbers)

  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield s"$c$n-$color"
  println(forCombinations)

  val name = "Scala"
  val doubleChars = name.flatMap(c => s"$c$c")
  println(doubleChars)
}  
