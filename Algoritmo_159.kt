import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var x: Double
    var fx: Double
    print("\nDigite valor de x: ")
    x = readln().toDouble()
    if (x > 4.0 || x < -4.0) {
        fx = (5 * x + 3) / sqrt(x.pow(2) - 16)
        println("\nf(x) = $fx")
    } else {
        println("\nNAO PODE SER FEITA")
    }
}
