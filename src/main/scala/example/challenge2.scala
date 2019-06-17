package example

object challenge2 extends App {
 var movieRatings = Map("Finding Nemo" -> "G", "Finding Dory" -> "PG", "Men in Black" -> "PG-13", "The Avengers" -> "PG-13")
  println(movieRatings.get("Finding Nemo"))
  movieRatings = movieRatings + ("HP" -> "PG")
  movieRatings.foreach(println)

}
