import kotlin.math.ln

fun main() {
    var numero: Double
    var base: Double
    var logaritmo: Double
    print("\nEntre com o logaritmando: ")
    numero = readln().toDouble()
    print("\nEntre com a base: ")
    base = readln().toDouble()
    logaritmo = ln(numero) / ln(base)
    println("\no logaritmo de $numero na base $base é: $logaritmo")
}
