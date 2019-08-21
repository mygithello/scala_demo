package extractor

object TestExtractor2 {
  def main(args: Array[String]) {

    val x = TestExtractor2(5)
    println(x)

    /**
      * 当我们在提取器对象中使用 match 语句是，unapply 将自动执行
      */
    x match
    {
      case TestExtractor2(num) => println(x + " 是 " + num + " 的两倍！")
      //当时执行match内的方法后，unapply被调用，后续不再执行
      //unapply 被调用
      case _ => println("无法计算")
    }

  }
  def apply(x: Int) = x*2
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}