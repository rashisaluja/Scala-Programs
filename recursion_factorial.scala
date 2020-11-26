object recursion_factorial {
  def fact(a:BigInt):BigInt = {
    if (a<=1)
      1
    else
      a * fact(a-1)
  }
  def main(args: Array[String]): Unit ={
    println(fact(55))
  }

}
