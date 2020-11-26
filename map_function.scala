object map_function {
  def main(args: Array[String]): Unit ={
    var a = scala.collection.mutable.Map(1 -> "Blue",2 -> "Black",3 -> "Maroon")
    println(a.values)
    //updating
    a(2) = "Purple"
    println(a)
    //removing
    println(a - 3)
    //check if a is empty
    println(a.isEmpty)
    //contains key 1
    println(a.contains(1))
  }
}

