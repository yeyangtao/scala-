package methodandfunc

import Array._

object ArraysTest {

  def main(args: Array[String]): Unit = {
    var arr = new Array[String](3)
    arr(0) = "000"
    arr(1) = "111"
    arr(2) = "222"
    var arr1 = Array[String]("0000", "1111", "2222")
    for (s <- arr) {
      println(s)
    }
    for (s <- arr1) {
      println(s)
    }
    var arr2 = concat(arr, arr1)
    for(s<-arr2){
      println(s)
    }
    var arr3 = range(1,100,2)
    for(s<-arr3){
      print(s+",")
    }

  }

}
