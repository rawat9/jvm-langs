Due to internal compiling script,(to be fixed)

1.- DOMJUDGE requires every submission file to be _renamed_ "Main.scala"
2.- It does not accept @main "decorators" as it should in Scala 3.
	So, use traditional Scala 2.0 brackets formula for main procedure.
	(In IntelliJ IDEA or others ID's should be OK)
	
//@main def main(): Unit =
object Main extends App {
  for line <- Source.stdin.getLines do
    val arg_vector = line match
      case "" => Vector()
      case _ => line.split(" ").toVector.map(_.toInt)
    val sol = only_odd(arg_vector)
    println(sol)
}
