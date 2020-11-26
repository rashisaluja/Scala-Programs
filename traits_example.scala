
trait trait1{
  // abstract method
  def name
  // non abstract method
  def age: Unit ={
    println("My age is 20.")
  }
}
class traits_example extends trait1 {
  def name: Unit ={
    println("My name is Adityaraj.")
  }
}
object Main{
  def main(args: Array[String]): Unit ={
    val obj = new traits_example()
    obj.name
    obj.age
  }
}
