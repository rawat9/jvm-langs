import scala.annotation.tailrec
import scala.io.Source

@tailrec
def palindrome_recursive(str: String): Boolean =
  str.length match
    case 0 => true
    case 1 => true
    case _ => {
      if (str.head != str.last) then return false
      palindrome_recursive(str.substring(1, str.length - 1))
    }


object PalindromeRecursive extends App {
  for word <- Source.stdin.getLines do
    val sol = if palindrome_recursive(word) then 1 else 0
    println(sol)
}
