
class auxiliary_constructors(var name:String,var age:Int) {
  def this(){
    this("Adityaraj",20)
  }
  def printObject(): Unit ={
    println(s"name: "+name)
    println(s"age: "+age)
  }
}
object first{
  def main(args:Array[String]): Unit ={
    val ob1 = new constructors()
    ob1.printObject()
  }
}
