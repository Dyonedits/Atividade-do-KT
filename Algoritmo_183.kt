import kotlin.math.pow

fun main() {
    var numero: Double
    for (contador in 1..10) {
        print("\nDigite numero: ")
        numero = readln().toDouble()
        println("quadrado: ${numero.pow(2)}")
    }
}
