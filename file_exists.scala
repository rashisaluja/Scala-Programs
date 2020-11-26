

object file_exists {
  def main(args: Array[String]): Unit = {
    println(new  java.io.File("ScalaFile.txt").exists)
  }

}
