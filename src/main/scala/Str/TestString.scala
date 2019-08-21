object TestString {
  def main(args: Array[String]) {
    //String 对象是不可变的，如果你需要创建一个可以修改的字符串，可以使用 String Builder 类，如下实例:
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"
    println( "buf is : " + buf.toString );


    //字符串长度方法
    val len = buf.length
    println("String Length is : " + len)


    //字符串连接
    println("菜鸟教程官网： ".concat("www.runoob.com"))
    //用加号连接
    println("菜鸟教程官网： " + " www.runoob.com")



    //格式化字符窜
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs = printf("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)
    println(fs)

  }
}
