object recursion_length_string {
  def Len(n: String): Int =
  {
    if (n.equals(""))
      0
    else
      Len(n.substring(1)) + 1
  }
  def main(args: Array[String]): Unit ={
    var str = "scala"
    println("Length : "+Len(str))
  }

}

