//Tuple:Small ordered collection of objects of different data types.
//Cannot iterate/traverse through tuple. Can contain 2 to 22 elements.
//Starts with index 1 unlike Arrays
val tuple = (1, false, "Hello")
val tuple2 = "computer" -> "Think pad"
val tuple3 = "computer" -> "Think pad" -> true

println(tuple._2)
println(tuple2._2)

def div10(n: Int) = (n / 10, n % 10)
val (tens, ones) = div10(85)
print(s"Tens digit is $tens")
print(s"Ones digit is $ones")

def div100(n: Int) = (n / 100, n / 10 % 10, n % 10)
val (hunds2, tens2, ones2) = div100(885)
print(s"Tens digit is $hunds2")
print(s"Tens digit is $tens2")
print(s"Ones digit is $ones2")

//Sets: iterables that contain no duplicate values.
val fruits = Set("apples", "peach", "pear", "banana")
fruits("pear")
fruits.contains("potato")

//sets strips out the duplicates.
var s = Set(1, 2, 1, 5, 2)
s += 9
println(s)

if(s.isEmpty)
  println("Empty")
else
  println(s.head)
  println(s.tail)

//Combining 2 sets
fruits ++ s

// Map

var g = Map(1 -> "Milk", 2 -> "Bread", 3 -> "Butter")
g(1)
g = g + (4 -> "Eggs")
g(4)
g.get(6)
g.getOrElse(7, "Key not found")

//Arrays

var movies: Array[String] = new Array[String](5)
movies(0) = "MI-1"
println(movies)

var furniture = Array("Sofa", "Chair", "Table")

def print(strArray: Array[String]) = strArray.foreach(println)
print(furniture)
print(movies)

//Scala lists
//Unlike arrays elements lists cannot be changed by assignment.
val empty: List[Nothing] = List()
var a = List(1, 3.9, "dfa")
//Creating a list using cons operator
var x = 1::2::3::4::5::Nil
var x1 = List.range(10, 20)
var x2 = List.range(10, 20, 3)
//Merge lists using :::
var x3 = x1:::x2
var x4 = List.concat(x1, x2)

x1.foreach(println)

var sum = x1.foldLeft(0.0)(_+_)
var sum2 = 0
x1.foreach(sum2+=_)
println(sum2)

var add2 = x1.map(_+2)