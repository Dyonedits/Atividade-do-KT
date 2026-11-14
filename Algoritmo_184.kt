import kotlin.math.ln

fun main() {
    var numero: Double
    for (contador in 1..8) {
        print("\nDigite numero: ")
        numero = readln().toDouble()
        if (numero > 0.0) {
            println("\nlogaritmo: ${ln(numero) / ln(10.0)}")
        } else {
            println("\nNao faco logaritmo de numero negativo")
        }
    }
}
