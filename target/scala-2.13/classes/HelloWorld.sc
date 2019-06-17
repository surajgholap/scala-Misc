print("Hello World")

var odds = List(1, 3, 5, 7)

val str = "jello!"
print(str)

def upper(strings: String*): collection.Seq[String] =
{
  strings.map((s:String) => s.toUpperCase())
}

print(upper("hello", "hi"))

val nums = List(1, 2, 3)
for(n <- nums) println("nums " + n)

for(i <- 10 to 1 by -1) print(i+ ", ")

var list = List(1, 2, 3.5)
var list2 = List(1, 2, 3.5, true)
var list3 = List(1, 2, 3.5, true, "fk")


//LOOPS

var i = 8
while(i > 0) {
  println(i)
  i -= 1
}

val fruits = List("apples", "pears", "berries")
for(f <- fruits) println(f)
for(f <- fruits if(f.startsWith("p"))) println("Starts with p: " + f)

//nested for loop

for(i <- 1 to 5;
j <- 1 to 5)
  println(i * j + ", ")

//Square the even nums between 1 to 10
for(i <- 1 to 10 if(i % 2 == 0))
  yield i * i

//Call by value functions

def add(x:Int, y: Int) = x + y
add(2, 4)

def hello = "Hello world!"
hello

//Call by name functions

//Here is an example from Martin Odersky:

def test (x:Int, y: Int)= x*x
/*
We want to examine the evaluation strategy and determine which one is faster (less steps) in these conditions:

  test (2,3)

call by value: test(2,3) -> 2*2 -> 4
call by name: test(2,3) -> 2*2 -> 4
Here the result is reached with the same number of steps.

  test (3+4,8)

call by value: test (7,8) -> 7*7 -> 49
call by name: (3+4) (3+4) -> 7(3+4)-> 7*7 ->49
Here call by value is faster.

test (7,2*4)

call by value: test(7,8) -> 7*7 -> 49
call by name: 7 * 7 -> 49
Here call by name is faster

test (3+4, 2*4)

call by value: test(7,2*4) -> test(7, 8) -> 7*7 -> 49
call by name: (3+4)(3+4) -> 7(3+4) -> 7*7 -> 49
The result is reached within the same steps.
*/

//Foldleft function

val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
println(s"Elements of donuts1 = $donuts")

println(donuts.foldLeft("")(_ + _ +" Donuts "))