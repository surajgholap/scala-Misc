def add(x: Int, y: Int) = x + y
def subtract(x: Int, y: Int) = x - y
add(10, 39)
subtract(10, 39)

// In Scala, variables can be declared without data types if they
// contain an initialization value.
val num = 5
val dec = 4.3434
val x = 23 + 23.3
List(2, 4.4)
List(2, 4.4, true)
List(2, 4.4, true, List(3, 4))

//Loops
var u = 3
while (u > 0) {
  println(u)
  u -= 1
}

var d = 3
do {
  println(d)
  d -= 1
} while (d > 0)

for (i <- 3 to 1 by -1) {
  println(i)
}
for (j <- 3 to 1 by -1) yield j

var word = "Hello"
for(x <- 0 until(word.length)) {println(word(x))}

word.foreach(println)


//Higher order functions
//-is a function that takes another function as a parameter or returns a
//function.

//Function that takes another function as an input
val doubler = (x: Int) => 2 * x
def higherOrder(x: Int, y: Int => Int) = y(x)
println(higherOrder(3, doubler))

def higherOrder2(x: Int, y: Int, f: (Int,Int) => Int) = f(x,y)
println(higherOrder2(2, 5, add))

//Function that returns another function
def sayHello = (name: String) => "Hello " + name
var message = sayHello("Perry")
message


//Closure Functions
//- function whose return value depends upon the variable defined outside
//the function
var y = 4
val multiplier = (x: Int) => x * y
multiplier(3)

//Bitwise operators:&, |, ^, ~, >>, <<
var h = 3 //binary form: 0011
var g = 9 //binary form: 1001
h & g //answer is: 0001
h | g //answer is: 1011
h ^ g //answer is: 1010
h >> 2
g << 2

//cons operator :: -> creates a list
val nums = 1::2::3::4::Nil

// Match case
var v = 3
v match {
  case 3 => print("correct")
  case 4 => print("incorrect")
  case _ => print("default")
}

//Pattern matching
def greekAlphabet(letter: Char) = {
  letter match {
    case 'a' | 'A' => "Alpha"
    case 'b' | 'B' => "Beta"
    case 't' | 'T' => "Tau"
    case _ => "Invalid Char"
  }
}

greekAlphabet('a')
greekAlphabet('i')

def max(x: Int, y: Int) = x > y match {
  case true => x
  case false => y
}

max(4, 5)
max(7, 5)