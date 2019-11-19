package scalaloop

object LoopTest {
  def main(args: Array[String]) {
    var a = 0;
    val list = for {a <- 1 to 10; if a != 4;if a%2==0} yield a;
    for (a <- list) {
      println(a);
    }
  }
}

