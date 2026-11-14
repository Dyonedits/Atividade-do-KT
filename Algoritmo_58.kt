import kotlin.math.ln

fun main() {
    var numero1: Double
    var numero2: Double
    var numero3: Double
    var x: Double
    print("\nEntrar com 1 valor: ")
    numero1 = readln().toDouble()
    print("\nEntrar com 2 valor: ")
    numero2 = readln().toDouble()
    print("\nEntrar com 3 valor: ")
    numero3 = readln().toDouble()
    x = numero1 + numero2 / (numero3 + numero1) + 2 * (numero1 - numero2) + ln(64.0) / ln(2.0)
    println("\nX = $x")
}
