object implicits_2 extends App {
  val pair = "Daniel" -> "555"
  println(pair)

  case class Person[A](name: A) {
    def ====>[B](x: B): Map[A, B] = Map(name -> x)
  }

  implicit def fromStringToPerson[A](str: A): Person[A] = Person(str)

  println("Bob" ====> 12)
  println(12 ====> "Bob")
  println("12" ====> "Bob")
}