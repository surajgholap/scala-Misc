/*
Tower of Hanoi
*/

//Function to handle hanoi disc tranfers
def hanoi(nums: Int, from: Char, spare: Char, to: Char): Unit = {
  if(nums == 1) println(s"Transfer disc from $from to $to.")
  else{
    hanoi(nums-1, from, to, spare)
    hanoi(1, from, spare, to)
    hanoi(nums-1, spare, from, to)
  }
}

//Calling the function and declaring the num of discs
val numsDisc = 3
hanoi(numsDisc, 'f', 's', 't')


/*
Fibonnaci series
 */
def fibIter(nums: Int) = {
  var a = 1
  var b = 1
  if(nums == 1 || nums == 2) println(s"answer of $nums fibonnaci number is $a")
  else{
    var temp = 0
    for (i <- 2 until nums) {
      //    println(i)
      temp = a + b
      a = b
      b = temp
    }
    println(s"answer of $nums fibonnaci number is $temp")
  }
}

fibIter(1)
fibIter(2)
fibIter(3)
fibIter(4)
fibIter(5)
fibIter(6)

def fibRecur(nums: Int): Int= {
  if(nums == 1 || nums == 2) 1
  else fibRecur(nums-1) + fibRecur(nums-2)
}

fibRecur(1)
fibRecur(2)
fibRecur(3)
fibRecur(4)
fibRecur(5)
fibRecur(6)
