import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var x: Double
    var y: Double
    print("\nDigite valor de x: ")
    x = readln().toDouble()
    print("\nDigite valor de y: ")
    y = readln().toDouble()
    if (x > y) {
        if (x >= 0.0) {
            println("\nraiz do maior: ${sqrt(x)}")
        } else {
            println("\nnão é possível calcular a raiz do maior")
        }
        println("quadrado do menor: ${y.pow(2)}")
    } else {
        if (y > x) {
            if (y >= 0.0) {
                println("\nraiz do maior: ${sqrt(y)}")
            } else {
                println("\nnão é possível calcular a raiz do maior")
            }
            println("quadrado do menor: ${x.pow(2)}")
        } else {
            println("\nnumeros iguais")
        }
    }
}
