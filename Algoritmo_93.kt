import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var numero: Double
    print("\nDigite numero: ")
    numero = readln().toDouble()
    if (numero > 0.0) {
        println("\nraiz: ${sqrt(numero)}")
    } else {
        if (numero < 0.0) {
            println("\nquadrado: ${numero.pow(2)}")
        }
    }
}
