object ff extends App {

  def curriedAdder(x: Int)(y: Int): Int = x*2 + y

  var added: Int => Int = curriedAdder(_)(9)
  println(added(0))
  println(added(0))

  var x = 0
  val threads = (1 to 100).map(_ => new Thread(() => x += 1))
//  threads.foreach(println)
  threads.foreach(_.start())

  println(x)
}
