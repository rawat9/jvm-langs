import scala.io.Source

def maximum(arg_vector: Vector[Int]): Int = arg_vector.max

object Maximum extends App {
  for line <- Source.stdin.getLines do
    val arg_vector = line.split(" ").toVector.map(_.toInt)
    val sol = maximum(arg_vector)
    println(sol)
}