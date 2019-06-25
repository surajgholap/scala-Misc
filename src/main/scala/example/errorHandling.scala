package example
import io.Source._
import java.io._

object errrorHandling extends App {

  try {
    for (line <- fromFile("src/main/scala/example/notExists.txt").getLines()) {
      println(line.toLowerCase())
    }
  } catch {
    case e:FileNotFoundException => println("File doesn't exist.")
    case _:Exception => ("Error in code")
  }

  try {
    var q = 5 / 0
  } catch {
    case e:ArithmeticException => println("Don't divide by zero!")
  }
}
