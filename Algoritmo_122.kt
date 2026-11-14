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
        println("\nPodem ser lados de um triangulo")
    } else {
        println("\nNão podem ser lados de um triangulo")
    }
}
