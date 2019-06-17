
  println("OOP snaps!")

  class Oop(val make: String, val model: String, val ram: String) {
    override def toString: String = {"[" + make + ", " + model + ", " + ram + "]\n"}

  }

  val systems = List(new Oop("Dell", "XT", "8GB"),
    new Oop("Sony", "F15", "16GB"),
    new Oop("Dell", "Inspiron", "8GB"))

  val first = systems.head
  val rest = systems.tail



//Case class: Special types of classes.
//  has immutable instance  values.
//  Initialize instances without new keyword.
  case class Money(val amount: Int = 1, val currency: String = "USD") {
  def +(other: Money): Money = Money(amount + other.amount)
}
  val defaultMoney = Money()
  val fiveDollars = Money(5)
  val fiveEuros = Money(5, "EUR")
  val euros = Money(currency = "EUR")
  // Copy command
  val tenDollars = euros.copy(10)
  val tenDollarsReal = tenDollars.copy(currency = "USD")

  val moneyList = List(Money(), Money(5), Money(10, "EUR"))

  println(s"Addition is " + {Money(5) + Money(10)})

//  Singleton objects"
  // provides a convenient way to group functions that aren't members of a class.
  // Everytime we define a object in Scala it is a singleton object.

  object HelloWorld{
    def main(args: Array[String]): Unit = {
      println("Hello world!")
    }
  }

//  There is no static identifier in Scala. Instead, Scala uses these singletons to represent what would normally be static in Java. So once again,
//  when you create an object using the keyword "object", you're actually creating a singleton.