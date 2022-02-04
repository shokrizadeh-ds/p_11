object implicits extends App {
  val pair = "Daniel" -> "555"
  println(pair)

  case class Person(name: String) {
    def ====>(x: Int): Map[String, Int] = Map(name -> x)
  }

  implicit def fromStringToPerson(str: String): Person = Person(str)

  println("Bob" ====> 12)
}
