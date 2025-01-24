package Lectures.part2oops

object OOBasicsExercise extends App {
  /*
  Novel and a Writer

  Writer : firstname , surname, year
    -method fullname

  Novel : name , year of release , author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel

   */

  val author = new Writer("Chandu","Siriyala",2004)
  val novel = new Novel("Biogrpahy",2070,author)

  println(author.fullname)
  println(novel.authorAge)
  println(novel.isWritterBy(author))
  println(novel.copy)




  /*
  Counter Class

   - recieves an int value
   - method current count
   - method to increment/decrement => new Counter
   - overload inc/dec to recieve an amount

   */

  val counter  =  new Counter

  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


}


class Writer(firstname : String , surname : String ,val year : Int ) {
  def fullname :String = firstname+" "+surname
}

class Novel(name :String, year :Int, author : Writer) {

  def authorAge = year - author.year

  def isWritterBy(author : Writer)  = author == this.author

  def copy(newYear  :Int) : Novel = new Novel(name, newYear,author)


}


class Counter(val count:Int = 0) {


  def inc = {
    println("Incremeting")
    new Counter(count + 1)  //immutability
  }
  def dec =
    {
      println("Decremeting")
      new Counter(count - 1)
    }

   def inc(n: Int) : Counter = {
     if (n <= 0) this
     else inc.inc(n-1)
   }
   def dec(n:Int) : Counter = {
     if (n <= 0) this
     else dec.dec(n-1)
   }

   def print = println(count)

}