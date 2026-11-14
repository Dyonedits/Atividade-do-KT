fun main() {
    var a: Double
    var b: Double
    var c: Double
    var auxiliar: Double
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
    println("\nOrdem Crescente: $a $b $c")
}
