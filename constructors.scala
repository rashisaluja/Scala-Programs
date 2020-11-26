class constructors(var name:String,var age:Int) {
  def this(){
    this("Rashi",19)
  }
  def this(name:String){
    this(name,20)
  }
  def printObject(): Unit ={
    println(s"name: "+name)
    println(s"age: "+age)
  }
}
object main{
  def main(args:Array[String]): Unit ={
    val ob1 = new constructors()
    val ob2 = new constructors("Tom",13)
    val ob3 = new constructors("New")
    ob3.printObject()
  }
}
