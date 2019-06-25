package example
import io.Source._

object Example3 extends App {

  var fileName = "src/main/scala/example/file.txt"
  for(line <- fromFile(fileName).getLines()){
    println(line.toUpperCase())
  }
println()
  var poemLines = fromFile("src/main/scala/example/file.txt").getLines().toList
  println(poemLines)
  poemLines.foreach(println)
}
