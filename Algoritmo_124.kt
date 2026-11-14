import kotlin.math.pow

fun main() {
    var a: Double
    var b: Double
    var c: Double
    var maior: Double
    var lados: Double
    print("\nDigite 1 lado: ")
    a = readln().toDouble()
    print("\nDigite 2 lado: ")
    b = readln().toDouble()
    print("\nDigite 3 lado: ")
    c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a > b && a > c) {
            maior = a.pow(2)
            lados = b.pow(2) + c.pow(2)
        } else {
            if (b > c) {
                maior = b.pow(2)
                lados = a.pow(2) + c.pow(2)
            } else {
                maior = c.pow(2)
                lados = a.pow(2) + b.pow(2)
            }
        }
        if (maior == lados) {
            println("\nTriangulo Retangulo")
        } else {
            if (maior > lados) {
                println("\nTriangulo Obtusangulo")
            } else {
                println("\nTriangulo Acutangulo")
            }
        }
    } else {
        println("\nAs medidas não formam um triangulo")
    }
}
