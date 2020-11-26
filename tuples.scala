
object tuples {
  val mytuple = (1,2,3,"adityaraj","jain")
  def main(args:Array[String]):Unit = {

    mytuple.productIterator.foreach(i => {
      println(i)
    })

    println("Accessing by element number:")
    println(mytuple._3)
  }
}

