case class Employee(id: Int, fName: String, lName: String) {
  override def toString: String = {
    "Employee id: " + id + "\n"  + "Full Name: " + fName + " " + lName}
}

val listEmp = List(Employee(12345, "L", "P"),
  Employee(34554, "F", "L"))

listEmp.foreach(println)