package extractortest

object ExtractorTest {
  def main(args: Array[String]): Unit = {
    println("Apply 方法 : " + apply("Zara", "gmail.com"));
    println("Unapply 方法 : " + unapply("Zara@gmail.com"));
    println("Unapply 方法 : " + unapply("Zara Ali"));
    //根据apply方法，可以不需要new 就能创建对象
    println(ExtractorTest("yyt", "qq.com"))
  }

  // 注入方法
  def apply(user: String, domain: String) = {
    user + "@" + domain
  }

  // 提取方法
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }
  }
}
