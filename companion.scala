

// Companion class
class companion {
    private def name(): Unit = {
      println("This is a companion class.")
    }
}
// Companion object
object companion{
  def main(args:Array[String]): Unit ={
    new companion().name()
  }
}
// This shows that private members of
// companion class are accessible to
// companion object.
