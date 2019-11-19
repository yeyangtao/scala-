package collection

import scala.collection.immutable.Nil

object ListTest {
  def main(args: Array[String]): Unit = {
    //创建列表
    val list: List[Int] = List(1, 2, 3, 3, 3)
    val list1 = 1 :: (2 :: (3 :: (4 :: Nil)))
    //返回列表第一个元素
    println(list.head)
    //返回去掉第一个元素的列表
    println(list1.tail)
    //列表连接
    println("使用:::连接列表：" + (list ::: list1))
    println("使用List.:::()连接:" + list.:::(list1))
    println("使用concat连接:" + List.concat(list, list1))
    //创建指定数量的重复列表
    val list2 = List.fill(3)("yyt")
    println(list2)
    //通过给定的函数来创建列表
    var list3 = List.tabulate(6)(a => a * a)
    println(list3)
    //反转
    println(list3.reverse)
    //头部添加元素
    list3 = list3.::(2)
    println(list3)
    list3 = list3.+:(3)
    println(list3)
    //判断指定条件元素是否存在
    println(list3.exists(a=>a ==0))
    //输出指定条件的元素的列表
    println(list3.filter(a=>a>10))
    //排序
    println(list3.sorted)
    //交集
    println(list3.intersect(list))
  }

}
