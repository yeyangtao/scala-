package matchtest

/**
 * 模式匹配
 */
object MatchTest {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest(666))
    println(matchTest("2"))
    println(matchTest(5.5))
    //样例类
    case class Person(name:String,age:Int)
    //例子
    val tom = new Person("tom",18)
    val jack = new Person("jack",20)
    val yyt = new Person("yyt",21)
    for(p<-List(tom,jack,yyt)){
      p match {
        case Person("tom",18)=>println("hi tom")
        case Person("jack",20)=>println("hi jack")
        case Person(name,age) =>println("name:"+name+",age:"+age)
      }
    }
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "2" => "two"
    case i:Int => "整型"
    case _ => "many"
  }
}
