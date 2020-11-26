// RASHI SALUJA


object vectors {
  def main(args: Array[String]): Unit = {
    val v1 = Vector(11,12,13)
    val v2 = Vector(14,15,16)
    println("Merged vector: "+ (v1++v2))
    println("Reversed vector: "+ v1.reverse )
    println("Sorted vector: "+ v1.sorted)
  }
}

