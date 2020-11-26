
import scala.collection.immutable.HashSet
object immutable_hashset {
  def main(args: Array[String]): Unit = {
    val hashSet: HashSet[String] = HashSet( "hi","bye","hello")
    println(s"Elements are = $hashSet")

    //Removing an element from hashset
    val hs1: HashSet[String] = hashSet - "hi"
    println(s"Removing element from hashset = $hs1")

    //Adding two hash sets together
    val hs2: HashSet[String] = hs1 ++ HashSet("Scala","hashset")
    println(s"Adding hashset = $hs2")
  }
}
