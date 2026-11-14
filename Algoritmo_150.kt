import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun main() {
    var angulo: Double
    var radianos: Double
    print("\nDigite angulo em graus: ")
    angulo = readln().toDouble()
    radianos = angulo * PI / 180
    if ((radianos > PI / 2 && radianos <= PI) || (radianos > 3 * PI / 2 && radianos <= 2 * PI)) {
        println("\nseno: ${sin(radianos)}")
    } else {
        println("\nco-seno: ${cos(radianos)}")
    }
}
