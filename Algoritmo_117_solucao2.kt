fun main() {
    var a: Double
    var b: Double
    var c: Double
    var maior: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    print("\nDigite 3 numero: ")
    c = readln().toDouble()
    maior = a
    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }
    println("\nmaior: $maior")
}
