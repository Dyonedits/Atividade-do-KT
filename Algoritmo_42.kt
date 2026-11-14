import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

fun main() {
    var angulo: Double
    var radianos: Double
    print("\nDigite um ângulo em graus: ")
    angulo = readln().toDouble()
    radianos = angulo * PI / 180
    println("\nseno: ${sin(radianos)}")
    println("co-seno: ${cos(radianos)}")
    println("tangente: ${tan(radianos)}")
    println("co-secante: ${1 / sin(radianos)}")
    println("secante: ${1 / cos(radianos)}")
    println("cotangente: ${1 / tan(radianos)}")
}
