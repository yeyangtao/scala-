package collection

import scala.collection.immutable.Nil

object CollectionTest {
  def main(args: Array[String]): Unit = {
    //1、列表
    val list:List[Int] = List(1,2,3,3)
    val list1 = 1::(2::(3::(4::Nil)))
    println(list)
    println(list1)
    //2、集合，无序不可重复
    val set = Set(1,2,3)
    //3、映射
    val map = Map("one"->1,"two"->2,"three"->3)
    //4、元组，可以存放不同类型
    val tuple = (1,"one")
    //遍历元组
    tuple.productIterator.foreach(i=>print(i))
    //5、Option(选项)类型用来表示一个值是可选的有值或无值即Some或None。
    val opt:Option[Int] = Some(5)
    val opt1:Option[Int] = map.get("two")
    val opt2:Option[Int] = map.get("four")
    println(opt1)
    println(opt2)
    println(opt1.getOrElse("没有"))
    println(opt2.getOrElse("没有"))
    //Option应用
    println(show(map.get("three")))
    println(show(map.get("four")))
    println(opt2.get)

  }
  def show(a:Option[Int]) = a match {
    case Some(b) => "存在值，为:"+b
    case None => "不存在值"
  }

}
