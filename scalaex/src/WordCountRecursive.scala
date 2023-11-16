
import scala.collection.mutable.ListBuffer
import scala.io.Source

def word_count_recursive(str: String) =
  val words = ListBuffer[String]()
  var currentIndex = 0

  for ((char, index) <- str.zipWithIndex) {
    println(char)
    if char.isSpaceChar then {
      val word = str.substring(currentIndex, index)
      words += word
      currentIndex = index + 1
    }
  }
  println(words)

//  str.foreach(char => char.isSpaceChar)


object WordCountRecursive extends App {
  for statement <- Source.stdin.getLines do
    val sol = word_count_recursive(statement)
    println(sol)
}
