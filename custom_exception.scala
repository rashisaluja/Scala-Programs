

class  ExceptionLineTooLong(s:String) extends Exception(s){}
class custom_exception {
  @throws(classOf[ExceptionLineTooLong])
  def validate(word:String): Unit ={
    if (word.length() > 8){
      throw new ExceptionLineTooLong("Not eligible")
    }
    else {
      println("Eligible")
    }
  }
}
object MainObject{
  def main(args:Array[String]){
    var word = "I am Adityaraj Jain."
    var e = new custom_exception()
    try{
      e.validate(word)
    }catch{
      case e : Exception => println("Exception Occured : "+e)
    }
  }
}
