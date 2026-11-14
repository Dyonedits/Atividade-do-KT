import kotlin.math.sqrt

fun main() {
    var a: Int
    var b: Int
    var c: Int
    var delta: Double
    var x1: Double
    var x2: Double
    print("\nEntre com valor de a: ")
    a = readln().toInt()
    print("\nEntre com valor de b: ")
    b = readln().toInt()
    print("\nEntre com valor de c: ")
    c = readln().toInt()
    if (a == 0) {
        println("\nNão é equação do segundo grau")
    } else {
        delta = (b * b - 4 * a * c).toDouble()
        if (delta >= 0.0) {
            delta = sqrt(delta)
            x1 = (-b + delta) / (2 * a)
            x2 = (-b - delta) / (2 * a)
            println("\nX1 = $x1\t\tX2 = $x2")
        } else {
            println("\nNão há raízes reais")
        }
    }
}
