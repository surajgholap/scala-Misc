package example

object Challenge extends App {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  for(i <- grades) {
    if(i >= 93)
      println("A")
    else if(i > 85)
      println("B")
    else if(i > 76)
      println("C")
    else if(i > 68)
      println("D")
    else println("F")
  }

  val size = grades.length
  val sum = grades.foldLeft(0.0)(_ + _)
  def avg() = sum / size
  println(avg())

}
