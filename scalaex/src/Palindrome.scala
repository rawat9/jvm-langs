import scala.io.Source

def palindrome(str: String): Boolean =
  var i = 0
  var j = str.length - 1

  while i < j do
    if str(i) != str(j) then
      return false
    i += 1
    j -= 1

  true

object Palindrome extends App {
  for word <- Source.stdin.getLines do
    val sol = if palindrome(word) then 1 else 0
    println(sol)
}
