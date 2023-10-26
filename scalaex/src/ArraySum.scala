import scala.io.Source

def sum_array(arg_vector: Vector[Int]): Int = arg_vector.sum

object ArraySum extends App {
  for line <- Source.stdin.getLines do
    val arg_vector = line match
      case "" => Vector()
      case _ => line.split(" ").toVector.map(_.toInt)
    val sol = sum_array(arg_vector)
    println(sol)
}