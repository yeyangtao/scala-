package methodandfunc

import java.util.Date

/**
 * 一些函数概念
 * 1、传名调用
 * 2、指定函数参数名来调用
 * 3、可变参数
 * 4、递归求阶乘
 * 5、函数可以设置默认参数值，不传参使用默认参数，传参代替默认值
 * 6、高阶函数,操作其他函数的函数
 * 7、函数嵌套
 * 8、匿名函数
 * 9、偏应用函数，不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数。
 * 10、函数柯里化：将原来接受两个参数的函数变成新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数
 */
object CallByNameTest {
  def main(args: Array[String]) {
    //传名调用
    getTime(time())
    //可以指定函数参数名来调用，可以不按照顺序
    add(b = 1, a = 2)
    add(2, 1)
    //可变参数
    strings("aaa", "aaa", "aa")
    strings("a")
    //递归求阶乘
    println(jiecheng(3))
    //5
    addDefault()
    addDefault(3, 2)
    //6
    println(apply(layout, 10))
    //7
    println(jiecheng1(0))
    println(jiecheng1(1))
    println(jiecheng1(3))
    //8
    val inc = (x: Int) => x + 1
    println(inc(1))
    //9
    log(new Date(), "正常的情况")
    val logg = log(new Date(), _: String);
    logg("使用偏应用函数")
    //10
    println(curry("hello,")("world"))
    //上面可以分为2个步骤
    //1、接收一个参数返回一个匿名函数
    val result = curry1("Hello,")
    println(result)
    //2、继续调用这个匿名函数
    println(result("WORLD"))
  }

  def time() = {
    println("调用time函数")
    System.nanoTime()
  }

  def getTime(t: => Long) = {
    println("getTime方法")
    println("参数：" + t)
    t
  }

  def add(a: Int, b: Int) = {
    println(2 * a + b)
  }

  def strings(a: String*) = {
    println("传入参数的个数：" + a.size)
  }

  def jiecheng(a: Int): Int = {
    if (a <= 1)
      1
    else
      a * jiecheng(a - 1)
  }

  def addDefault(a: Int = 5, b: Int = 6): Unit = {
    println(a + b)
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString + "]"

  def jiecheng1(i: Int): Int = {
    def jiecheng2(i: Int, b: Int): Int = {
      if (i <= 1)
        b
      else
        jiecheng2(i - 1, i * b)
    }

    jiecheng2(i, 1)
  }

  def log(date: Date, message: String) = {
    println(date + "," + message)
  }

  def curry(a: String)(b: String) = {
    a + b
  }

  def curry1(a: String) = (b: String) => a + b
}
