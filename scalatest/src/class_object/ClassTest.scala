package class_object

object ClassTest {
  def main(args: Array[String]): Unit = {
    val p = new Point(1, 1)
    p.move(2, 2)
    val loc = new Location(1,1,1)
    loc.move(2,2,2)
  }

  class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
      println("x:" + x)
      println("y:" + y)
    }
  }

  class Location(val xc: Int, val yc: Int, zc: Int) extends Point(xc, yc) {
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println("x 的坐标点 : " + x);
      println("y 的坐标点 : " + y);
      println("z 的坐标点 : " + z);
    }

  }

}
