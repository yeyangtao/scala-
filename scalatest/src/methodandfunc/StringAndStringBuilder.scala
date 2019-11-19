package methodandfunc

/**
 *String和StringBuilder
 */
object StringAndStringBuilder {
  def main(args: Array[String]): Unit = {
    val buf = new StringBuilder
    var str = ""
    val str1 = ""
    //str1 += 'a' 会报错
    str += 'a'
    str ++="a"
    buf += 'a'
    buf ++= "a"
    println(buf)
    println(str)
  }
}
