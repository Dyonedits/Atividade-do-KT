fun main() {
    var a: Double
    var b: Double
    var c: Double
    var maximo: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    print("\nDigite 3 numero: ")
    c = readln().toDouble()
    if (a > b) {
        if (a > c) {
            maximo = a
        } else {
            maximo = c
        }
    } else {
        if (b > c) {
            maximo = b
        } else {
            maximo = c
        }
    }
    println("\n$maximo")
}
