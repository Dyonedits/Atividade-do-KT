import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var lado: Double
    var perimetro: Double
    var area: Double
    var diagonal: Double
    print("\nDigite o lado do quadrado: ")
    lado = readln().toDouble()
    perimetro = 4 * lado
    area = lado.pow(2)
    diagonal = lado * sqrt(2.0)
    println("\nperimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")
}
