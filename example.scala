
class example(var age:Int) {
  def this(){
    this(20)
  }
  def display(): Unit ={
    println(s"Age: "+age)
  }
}
object example{
  def main(args:Array[String]): Unit ={
    var ob1 = new example()
    ob1.display()
  }
}
