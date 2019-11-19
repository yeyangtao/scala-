package methodandfunc

/**
 * 闭包:引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
 */
object ClosePackage {
  def main(args: Array[String]): Unit = {
    println(add(1))
  }
  var a = 3
  val add = (i:Int) => i+a

}
