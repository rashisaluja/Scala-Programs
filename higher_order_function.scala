object higher_order_function {
  def math(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int): Int = f(a, b, c);

  def main(args: Array[String]): Unit = {
    val maximum = math(16,21,30, (a, b, c) => if (a > b && a > c) {a}
                                      else {
                                            if (b > c) {b}
                                            else {c}
                                            });
    val minimum = math(16,21,30, (a, b, c) => if (a < b && a < c) {a}
                                      else {
                                            if (b < c) {b}
                                            else {c}
                                            });
    println(maximum)
    println(minimum)

  }
}
