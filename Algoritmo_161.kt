import kotlin.math.pow

fun main() {
    var numero: Double
    for (contador in 1..5) {
        print("\nnumero: ")
        numero = readln().toDouble()
        println("quadrado: ${numero.pow(2)}")
    }
}
