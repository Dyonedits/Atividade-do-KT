import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var hipotenusa: Double
    var cateto1: Double
    var cateto2: Double
    print("\nEntrar com 1 cateto: ")
    cateto1 = readln().toDouble()
    print("\nEntrar com 2 cateto: ")
    cateto2 = readln().toDouble()
    hipotenusa = sqrt(cateto1.pow(2) + cateto2.pow(2))
    println("\nA hipotenusa é: $hipotenusa")
}
