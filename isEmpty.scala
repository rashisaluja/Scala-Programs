

object isEmpty {
  def main(args: Array[String]) {
    val x:Option[Int] = Some(3)
    val y:Option[Int] = None
    println("x.isEmpty: " + x.isEmpty )
    println("y.isEmpty: " + y.isEmpty )
  }
}
