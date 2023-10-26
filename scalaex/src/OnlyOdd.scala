import scala.io.Source

def only_odd(vector: Vector[Int]): Int = vector.filter(_ % 2 != 0).sum

object OnlyOdd extends App {
  for line <- Source.stdin.getLines do
    val arg_vector = line match
      case "" => Vector()
      case _ => line.split(" ").toVector.map(_.toInt)
    val sol = only_odd(arg_vector)
    println(sol)
}
