import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var a: Double
    var b: Double
    var c: Double
    var diagonal: Double
    print("\nEntre com a base: ")
    a = readln().toDouble()
    print("\nEntre com a altura: ")
    b = readln().toDouble()
    print("\nEntre com a profundidade: ")
    c = readln().toDouble()
    diagonal = sqrt(a.pow(2) + b.pow(2) + c.pow(2))
    println("\ndiagonal: $diagonal")
}
