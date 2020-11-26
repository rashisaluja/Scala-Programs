object multiple_arguments {
  def subtract(a :Int, b :Int, args: Int *) : Int =
  {
    var ans = a - b
    for(a <- args)
    {
      ans -= a
    }
    return ans
  }
  def main(args: Array[String]): Unit ={
    println(subtract(10,20,6,8,9,7))
  }

}


