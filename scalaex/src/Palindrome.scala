import scala.io.Source

def palindrome(str: String): Boolean = str == str.reverse

object Palindrome extends App {
  for word <- Source.stdin.getLines do
    val sol = if palindrome(word) then 1 else 0
    println(sol)
}
