class Super {
  protected def f(){println("f")}
  class Sub extends Super{
    f()//正确
  }
  class otherss{
    (new Super).f(); //错误
  }
}
