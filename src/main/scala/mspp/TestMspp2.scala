package mspp

object TestMspp2 {
  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))

  }

  /**
    * 匹配到一个case 就不会再往下匹配了
    * @param x
    * @return
    */
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2

    //对应类型模式，用于判断传入的值是否为整型，相比使用isInstanceOf来判断类型
    case y: Int => "scala.Int"

    //表示默认的全匹配备选项，即没有找到其他匹配时的匹配项，类似 switch 中的 default
    case _ => "many"
  }
}
