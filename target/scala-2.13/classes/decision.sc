//IF statements
var hours = 20
var rate = 10
def earnings(h: Double): Double = {
  if(h <= hours)
    h * rate
  else
    (h - hours) * rate * 1.5 + hours * rate
}

println(earnings(28))
println(earnings(8))

//Match statements

val day1 = "FRI"
val day2 = "SAT"
val day3 = "AAA"

val result = day2 match {
    case "MON" | "TUE" | "WED" | "THURS" | "FRI" => "weekday"
    case "SAT" | "SUN" => "weekend"
    case _ => "Invalid"
}

println(result)