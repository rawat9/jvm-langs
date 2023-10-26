import scala.io.Source

def word_count(str: String): Int = str.strip().split(" ").length

object WordCount extends App {
  for statement <- Source.stdin.getLines do
    // why does changing the Type returns wrong result? firstly, why didn't it TypeError
    val sol: Int = word_count(statement)
    println(sol)
}
