import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var raio: Double
    var perimetro: Double
    var area: Double
    print("\nDigite raio: ")
    raio = readln().toDouble()
    perimetro = 2 * PI * raio
    area = PI * raio.pow(2)
    println("\nperimetro: $perimetro")
    println("area: $area")
}
