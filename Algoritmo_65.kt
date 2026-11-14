import kotlin.math.PI
import kotlin.math.pow

fun main() {
    var volume: Double
    var altura: Double
    var raio: Double
    print("\nDigite a altura da lata: ")
    altura = readln().toDouble()
    print("\nDigite o raio da lata: ")
    raio = readln().toDouble()
    volume = PI * raio.pow(2) * altura
    println("\no volume da lata é = $volume")
}
