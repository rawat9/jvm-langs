import scala.io.StdIn

def dot_product_recursive(value: Vector[Int], value1: Vector[Int]): Int = {
  value.length match
    case 0=> 0
    case _ => (value.head * value1.head) + dot_product_recursive(value.tail, value1.tail)
}

object DotProductRecursive extends App {
  var fst_line = StdIn.readLine()
  var snd_line: String = null
  while fst_line != null do
    val A = fst_line.split(" ").toVector.map(_.toInt)
    snd_line = StdIn.readLine()
    val B = snd_line.split(" ").toVector.map(_.toInt)
    val sol = dot_product_recursive(A, B)
    println(sol)
    fst_line = StdIn.readLine()
}
