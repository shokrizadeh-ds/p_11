println("Hello")

val l = Set(1,2,3)
l ++ Set(11,12)


println(("" + 12).getClass)



import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}


def aShortRunninTask(): Int = 42
val x = aShortRunninTask
println(x)

def aLongRunningTask(): Future[Int] = Future(1)
val y = aLongRunningTask
val z = y.map(_ * 1000)
println(z)
println(z.getClass)
//  y.map(println)
