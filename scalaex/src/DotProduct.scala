import scala.io.StdIn

def dot_product(value: Vector[Int], value1: Vector[Int]): Int = {
  var acc = 0
  for ((v1, v2) <- value zip value1) {
    acc += (v1 * v2)
  }
  acc
}


object DotProduct extends App {
  var fst_line = StdIn.readLine()
  var snd_line: String = null
  while fst_line != null do
    val A = fst_line.split(" ").toVector.map(_.toInt)
    snd_line = StdIn.readLine()
    val B = snd_line.split(" ").toVector.map(_.toInt)
    val sol = dot_product(A, B)
    println(sol)
    fst_line = StdIn.readLine()
}