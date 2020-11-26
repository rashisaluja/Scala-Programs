object switch_Example {
  def main(args:Array[String]){
    var name = "Divyansh"
    var age = 20
    var gender = "m"
    def voting(n:String,a:Int,g:String){
      println(s"Name: $n")
      println(s"Age: $a")
      println(s"Gender: $g")
      g match {
          case "f" => if(a>=21) println("Eligible for voting.")
                      else println("Not eligible for voting.")
          case "m" => if (a>=18) println("Eligible for voting")
                      else println("Not eligible for voting.")
      }

    }

    voting(name,age,gender)
  }
}
