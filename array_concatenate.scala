import Array._
object array_concatenate {
  def main(args: Array[String]): Unit ={
    var a1= Array(Array(1,2,3),Array(4,5,6))
    var a2 = Array(Array(7,8,9),Array(10,11,12))
    //concatenating
    var a3 = concat(a1,a2)
    for (i <- a3){
      for (j <- i){
        println(j)
      }
    }
    // value at [0][2]
    println("Value at [0][2] = "+a1(0)(2))
  }
}


