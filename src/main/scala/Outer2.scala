class Outer2 {
  class Inner {
     def f(){println("f")}
    class InnerMost {
      f()//正确
    }
  }
  (new Inner).f()//正确，默认时public
}
