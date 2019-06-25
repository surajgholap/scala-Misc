
println("Intro to Lambda functions in Scala: ")

//One way of calling an anonymous function
((x: Int) => x + 1)(5)

//Other way is
val f = (x: Int) => x + 1
f(5)
f.apply(3)

val doubler = (x: Double) => 2 * x
doubler(3)

//Scala also allows the definition of higher order functions.
//These are functions that take other functions as parameters or whose result is a function.

def someOperation(f: (Int, Int) => Int): Unit = {
  println(f(5,5))
}
val add = (x: Int, y: Int) => x + y
someOperation(add)

//Method that returns function
def greeting() = (name: String) => "Hello " + name
val g = greeting()
g("eggy")

//Closure function:
//A closure is a function whose return value depends on the value of one or more variables
//that are declared outside of the function.

var y = 5
var multiplier = (x: Int) => x * y
multiplier(4)

//Function
def abs(inp: Int) = if(inp < 0) -inp else inp
abs(3)
abs(-3)

def fact(inp: Int):Int = if(inp == 1 | inp == 0) 1 else inp * fact(inp-1)
fact(3)
fact(4)

def fact1(inp: Int) = {
  var res = 1
  for(i <- 1 to inp)
    res *= i
  res
}
fact1(3)
fact1(4)

