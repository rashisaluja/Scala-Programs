object currying_func {
  var add = (a:Int , b:Int) => a+b
  def main(args:Array[String]): Unit ={
    var sum = add(15,1)
    println("ADDITION: "+sum)
  }

}

