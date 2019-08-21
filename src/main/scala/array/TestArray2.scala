import Array._
object TestArray2 {

  def main(args: Array[String]) {

    var myMatrix = ofDim[Int](3,3)
    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }


    //循环0--》8
    for (i <- 0 to 8) {
      print(i+"  ")
    }


    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 =  concat( myList1, myList2)

    // 输出所有数组元素
    for ( x <- myList3 ) {
      println( x )
    }

    //区间数组
    var myList11 = range(10, 20, 3) //默认区间为1，此处为3
    var myList22 = range(10,20)
    // 输出所有数组元素
    for ( x <- myList11 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList22) {
      print( " " + x )
    }




  }
}
