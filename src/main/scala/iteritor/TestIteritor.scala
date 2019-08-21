package iteritor

object TestIteritor {
  def main(args: Array[String]) {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext){
      println(it.next())
    }

    //找大小
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("最大元素是：" + ita.max )
    println("最小元素是：" + itb.min )

    //长度方法
    //测试发小此处不可用上面定义的，上面调用过大小方法后，迭代器中长度为空了
    val itaq = Iterator(20,40,2,50,69, 90)
    val itbq = Iterator(20,40,2,50,69, 90)
    //长度
    println("ita.size 的值: " + itaq.size )
    println("itb.length 的值: " + itbq.length )



  }

}
