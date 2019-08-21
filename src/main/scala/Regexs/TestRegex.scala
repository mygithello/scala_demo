package Regexs
import scala.util.matching.Regex

/**
  * 实例中使用 String 类的 r() 方法构造了一个Regex对象。
  * 然后使用 findFirstIn 方法找到首个匹配项。
  * 如果需要查看所有的匹配项可以使用 findAllIn 方法。
  * 你可以使用 mkString( ) 方法来连接正则表达式匹配结果的字符串，并可以使用管道(|)来设置不同的模式：
  */
object TestRegex {
  def main(args: Array[String]) {
    //val pattern = "Scala".r
    val pattern = new Regex("(S|s)cala")  // 首字母可以是大写 S 或小写 s
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str)

    println((pattern findAllIn str).mkString(","))   // 使用逗号 , 连接返回结果
    println((pattern findAllIn str))   // 使用逗号 , 连接返回结果

    //将匹配的文本替换为指定的关键词，可以使用 replaceFirstIn( ) 方法来替换第一个匹配项，使用 replaceAllIn( ) 方法替换所有匹配项
    println(pattern replaceFirstIn(str, "Java"))
    println(pattern replaceAllIn (str, "Java"))
  }
}
