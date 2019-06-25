package example
import io.StdIn._

object Example2 extends App {

  var done = false
  while(!done){
    var name = readLine("Enter your name: ")
    println("Enter your marks: ")
    var marks = readDouble()
    println(s"$name - You have received " +
      (if(marks >= 90) "A" else if(marks >= 80) "B"
      else if(marks >= 70) "C" else "D"))
    println("Enter true if done, false to continue..")
    done = readBoolean()
      }


}
