package method

object AddMethod{
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]) {
    println("Hello World  王先生")
    print(addInt(2,3))
  }
}
