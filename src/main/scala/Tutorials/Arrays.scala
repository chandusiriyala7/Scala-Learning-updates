package Tutorials

 class Arrays {
   var arr = Array(1,2,3,4,5,6)

   def show(): Unit = {
     for(i <- arr)
       println(i)
     println("First element of the Array : " + arr(0))
     arr.foreach((element:Int)=>println(element))
   }
 }

 class MatrixAddition {
   var matrix1 = Array(Array(1,2,3),Array(1,2,3),Array(1,2,3))
   var matrix2 = Array(Array(1,2,3),Array(1,2,3),Array(1,2,3))

   var addition_matrix = Array.ofDim[Int](3,3)

   def add():Unit ={
     for(i <- matrix1.indices; j <- matrix1(i).indices ){
       
         addition_matrix(i)(j) = matrix1(i)(j) + matrix2(i)(j)
     
     }
     for(i <- addition_matrix){
     
         println(i.mkString(" "))
       }
     }
   }


 object MainObject {
   def main(args:Array[String]): Unit = {
     var obj = new Arrays

     obj.show()

     var obj1 = new MatrixAddition

     obj1.add()
   }
 }