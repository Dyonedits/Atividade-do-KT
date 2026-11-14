import kotlin.math.sqrt

fun main() {
    var numero: Double
    for (contador in 1..15) {
        print("\nDigite numero: ")
        numero = readln().toDouble()
        if (numero >= 0.0) {
            println("\nraiz: ${sqrt(numero)}")
        } else {
            println("\nNao faco raiz de numero negativo")
        }
    }
}
