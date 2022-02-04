import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object futurePrac extends App {

  def aShortRunninTask(): Int = 42
  val x = aShortRunninTask
  println(x)

  def aLongRunningTask(): Future[Int] = Future  {
//    Thread.sleep(1000)
    12
  }

//  Thread.sleep(500)
  val y = aLongRunningTask()
  val z = y.map(_ * 1000)
  println(s"y: ${y.value}")
  println(z)
//  y.map(println)
  y.onComplete {
    case Success(x) => println("Successful")
    case Failure(f) => f.printStackTrace
  }
}
