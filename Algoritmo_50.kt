import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var perimetro: Double
    var area: Double
    var diagonal: Double
    var base: Double
    var altura: Double
    print("\nDigite base: ")
    base = readln().toDouble()
    print("\nDigite altura: ")
    altura = readln().toDouble()
    perimetro = 2 * (base + altura)
    area = base * altura
    diagonal = sqrt(base.pow(2) + altura.pow(2))
    println("\nperimetro = $perimetro")
    println("area = $area")
    println("diagonal = $diagonal")
}
