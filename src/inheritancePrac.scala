object inheritancePrac extends App {

  trait Cold {
    def print = println("cold")
  }

  trait Green extends Cold {
    override def print: Unit = {
      println("green")
      super.print
    }
  }

  trait Blue extends Cold {
    override def print: Unit = {
      println("blue")
      super.print
    }
  }

  trait Red {
    def print = println("red")
  }

  class White extends Green with Blue with Red {
    override def print: Unit = {
      println("white")
      super.print
    }
  }

  val color = new White
  color.print

}
