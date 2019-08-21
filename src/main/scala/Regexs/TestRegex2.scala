package Regexs

import scala.util.matching.Regex

/**
  * 上表中的每个字符使用了两个反斜线。
  * 这是因为在 Java 和 Scala 中字符串中的反斜线是转义字符。
  * 所以如果你要输出 .\.，你需要在字符串中写成 .\\. 来获取一个反斜线。查看以下实例：
  */
object TestRegex2 {
  def main(args: Array[String]) {
    val pattern = new Regex("abl[ae]\\d+")
    val str = "ablaw is able1 and cool"

    println((pattern findAllIn str).mkString(","))
  }
}
