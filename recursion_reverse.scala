object recursion_reverse {
  def reverse(a: String): String = {

    if (a.length == 1)  a
    else reverse(a.tail) + a.head
    }
  def main(args: Array[String]): Unit ={
    println(reverse("Adityaraj"))
  }

}


