fun main() {
    var a: Double
    var b: Double
    var c: Double
    var auxiliar: Double
    var maior: Double
    var intermediario: Double
    var menor: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    print("\nDigite 3 numero: ")
    c = readln().toDouble()
    if (a > b) {
        auxiliar = a
        a = b
        b = auxiliar
    }
    if (a > c) {
        auxiliar = a
        a = c
        c = auxiliar
    }
    if (b > c) {
        auxiliar = b
        b = c
        c = auxiliar
    }
    maior = c
    intermediario = b
    menor = a
    println("\nmaior: $maior")
    println("intermediario: $intermediario")
    println("menor: $menor")
}
