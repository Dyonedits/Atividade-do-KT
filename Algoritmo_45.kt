import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var numero: Double
    var quadrado: Double
    var raizQuadrada: Double
    print("\nDigite numero: ")
    numero = readln().toDouble()
    quadrado = numero.pow(2)
    raizQuadrada = sqrt(numero)
    println("\nnumero: $numero")
    println("quadrado: $quadrado")
    println("raiz quadrada: $raizQuadrada")
}
