import kotlin.math.ln

fun main() {
    var numero: Double
    var logaritmo: Double
    print("\nEntre com o logaritmando: ")
    numero = readln().toDouble()
    logaritmo = ln(numero) / ln(10.0)
    println("\nlogaritmo: $logaritmo")
}
