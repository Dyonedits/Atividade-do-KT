fun main() {
    var a: Double
    var b: Double
    var c: Double
    print("\nDigite 1 lado: ")
    a = readln().toDouble()
    print("\nDigite 2 lado: ")
    b = readln().toDouble()
    print("\nDigite 3 lado: ")
    c = readln().toDouble()
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("\nTriangulo equilatero")
        } else {
            if (a == b || a == c || b == c) {
                println("\nTriangulo isosceles")
            } else {
                println("\nTriangulo escaleno")
            }
        }
    } else {
        println("\nAs medidas não formam um triangulo")
    }
}
