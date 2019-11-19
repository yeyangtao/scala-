package class_object

class Maker private(val color: String) {
  println("创建" + this)

  override def toString: String = "颜色标记：" + color
}

//伴生对象，与类名称相同，可以访问类的私有属性和方法
object Maker {
  private val makers: Map[String, Maker] = Map(
    "red" -> new Maker("red"),
    "yellow" -> new Maker("yellow"),
    "blue" -> new Maker("blue")
  )

  def apply(color: String) = {
    if (makers.contains(color)) makers(color) else null
  }

  def getMaker(color: String) = {
    if (makers.contains(color)) makers(color) else null
  }

  def main(args: Array[String]): Unit = {
    println(Maker("red"))
    println(Maker getMaker "blue")
  }
}
