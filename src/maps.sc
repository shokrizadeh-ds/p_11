val states = Map(
  "AL" -> "Alabama",
  "AK" -> "Alaska",
  "AZ" -> "Arizona"
).withDefaultValue("Not found")


val x = states("TX")

Map(
  "AL" -> "Alabama",
  "AK" -> ("Alaska", "Texas"),
  "AZ" -> "Arizona"
).getOrElse("TX", "No such state")


val state = Map(
  "AL" -> "Alabama",
  "AK" -> ("Alaska", "Texas"),
  "AZ" -> "Arizona"
)

state.get("AK")

state foreach println

state.keysIterator.foreach{
  x => state.get(x) match {
    case Some((i, j)) => println(s"i:  $i, j: $j")
    case Some(i) => println(s"i: $i")
  }
}

state foreach {
  case (x, r @ (y1, y2)) => println(r)
  case _ => println("Pass")
}

val s = state.view
s.values.map(_.toString.toLowerCase).foreach(println)
val s = state.view
s.values.filter(!_.isInstanceOf[(String, String)]).map(_.toString.toLowerCase).toList
s.values.filter(_.isInstanceOf[(String, String)]).map(_.toString.toLowerCase).toList