
object singleton {
  def main(args:Array[String]): Unit ={
    SingletonObject.name()

  }
}
object SingletonObject{
  def name(): Unit ={
    println("HELLO.")
  }
}



