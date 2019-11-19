package methodandfunc

object MethodAndFunc {
  //定义一个方法，return可以省略
  def m(x:Int,y:Int):Int = {
   return x+y
  }
  //定义一个函数（匿名函数）
  val f= (x:Int)=>x+3

class Person{

}
  def main(args: Array[String]): Unit = {
    println(m(5,6))
    println(f(5))
  }

}
