package example

object Calculator {

  def main(args: Array[String]): Unit = {
    val x = 10
    val y = 5
    println("Addition is: " + addition(x, y))
    println("Subtraction is: " + minus(x, y))
    println("Multiplication is: " + times(x, y))
    println("Quotient is: " + quotient(x, y))

  }

  def addition(a: Int, b: Int): Int = a + b

  def minus(a: Int, b: Int): Int = a - b

  def quotient(a: Int, b: Int): Int = if (b != 0) a / b else 0

  def times(a: Int, b: Int): Int = a * b

}
