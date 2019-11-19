package iotest

import java.io.{File, PrintWriter}

import scala.io.StdIn

object IOTest {
  def main(args: Array[String]): Unit = {
    println("输入要写入文件的内容")
    val line = StdIn.readLine()
    writeFIle(line)
  }

  def writeFIle(str:String) = {
    val writer = new PrintWriter(new File("test.txt"))
    writer.write(str)
    writer.close()
  }
}
