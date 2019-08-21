package mspp

object TestMspp {
  def main(args: Array[String]) {
    println(matchTest(2))

  }
  //match 对应 Java 里的 switch，但是写在选择器表达式之后。即： 选择器 match {备选项}。
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"

  }
}