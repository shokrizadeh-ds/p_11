import ParallelCollect.fib

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureTest extends App {

  val f2 = Future {
    println("Start of execution...")
    for (k <- 1 to 30) {
      println(fib(k))
    } //yield fib(k)
  }

  //  f2.foreach(println)
  Thread.sleep(10)
  println("End of execution!")
}
