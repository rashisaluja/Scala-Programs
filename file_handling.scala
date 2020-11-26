

import java.io._
object file_handling {
  def main(args: Array[String]): Unit = {
    val fileObject = new File("ScalaFile.txt" )
    val pw = new PrintWriter(fileObject)
    pw.write("Hello, This is a scala file.")
    pw.close()
  }
}
