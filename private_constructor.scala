
class private_constructor private() {
  override def toString = "Private constructor."
}

object private_constructor {
  val ob1 = new private_constructor
  def getInstance = ob1
}

object SingletonTest extends App {

  val ob1 = private_constructor.getInstance
  println(ob1)
}
