import kotlin.math.pow

fun main() {
    var numero: Double
    for (contador in 1..4) {
        print("\nDigite numero: ")
        numero = readln().toDouble()
        println("\ncubo: ${numero.pow(3)}")
        if (numero < 0.0) {
            println("\nNao faco raiz de numero negativo")
        } else {
            println("\nraiz: ${numero.pow(1.0 / 3)}")
        }
    }
}
