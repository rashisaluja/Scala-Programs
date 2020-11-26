
class super_class {
  var a = 50
  var b = 40
}
class square extends super_class{
  def area() {
    println(s"Area of square is " + a * a)
  }
}
class rectangle extends super_class{
  def area() {
    println(s"Area of rectangle is " + a * b)
  }
}
class triangle extends super_class{
  def area() {
    println(s"Area of square is " + 0.5 * a * b)
  }
}
object model {
  def main(args: Array[String]): Unit = {
    val object1 = new square()
    val object2 = new rectangle()
    val object3 = new triangle()
    object1.area()
    object2.area()
    object3.area()
  }
}