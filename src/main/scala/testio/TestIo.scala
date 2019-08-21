package testio

import java.io._

object TestIo {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("D:/test.txt" ))
    writer.write("菜鸟教程")
    writer.close()
  }
}
