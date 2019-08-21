package testio

import scala.io.Source

object TestIo3{
  def main(args: Array[String]) {
    println("文件内容为:" )

    Source.fromFile("D://test.txt" ).foreach{
      print
    }
  }
}
