
object prime {
  def prime(c: Int): Boolean =
    c match{
      case 1=> false
      case 2=> true
      case _ => !(2 until c).exists(b => c % b == 0)

    }

  def main(args : Array[String]): Unit ={
    var a=0
    for (a <- 1 to 11){
      println(s"Is $a a prime number? "+prime(a))
    }
  }
}
