import kotlin.math.pow

fun main() {
    var x: Double
    var y: Double
    print("\nDigite valor de x: ")
    x = readln().toDouble()
    if (x <= 1.0) {
        y = 1.0
    } else {
        if (x <= 2.0) {
            y = 2.0
        } else {
            if (x <= 3.0) {
                y = x.pow(2)
            } else {
                y = x.pow(3)
            }
        }
    }
    println("\nvalor de f(x): $y")
}
