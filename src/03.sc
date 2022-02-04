def tt(bindings: (Int, Double)*) = {
  println(bindings)
  println(bindings.toMap)
}



tt(1 -> 1.3, 2 -> 4.1, 5 -> 6.9)

val it = Iterator(1, 2, 3)
it.hasNext