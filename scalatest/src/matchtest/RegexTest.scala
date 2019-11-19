package matchtest

object RegexTest {
  def main(args: Array[String]): Unit = {
    val pattern = "(Y|y)yt".r
    val str = "aha yyt is Yyta good person"
    println( pattern findFirstIn str)
    println((pattern findAllIn str).mkString(","))
  }

}
