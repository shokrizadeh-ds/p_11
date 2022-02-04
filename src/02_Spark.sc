List(1, 3,8).foldRight(100)((s, x) => x - s)

def r(x: Int, y:  Int) = {
  println(s"x: $x")
  println(s"y: $y")
  x - y
}


List(1, 3,8).foldRight(100)(r)

List(1,2,3) :: List(5)
List(1,2,3) :+ 5