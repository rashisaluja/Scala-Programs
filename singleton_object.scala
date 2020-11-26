
object singleton_object {
  object Math{
    def addition (a: Int=15 , b:Int=100):Int=
    {
      return a+b
    }
    def subtraction (a: Int=15, b:Int=100):Int=
    {
      return a-b;
    }
    def division (a: Int=15 , b:Int=100):Float=
    {
      return a/b;
    }
  }
  def main(args : Array[String])
  {
    var x=Math.addition();
    if(x>100){ println(s"Success: $x")}
    else{println("Try again")}
    println(Math.subtraction(3,10));
    println(Math.division());
  }

}
