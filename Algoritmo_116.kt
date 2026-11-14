fun main() {
    var a: Double
    var b: Double
    var c: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    print("\nDigite 3 numero: ")
    c = readln().toDouble()
    if (a > b) {
        if (a > c) {
            println("\nmaior: $a")
        } else {
            println("\nmaior: $c")
        }
    } else {
        if (b > c) {
            println("\nmaior: $b")
        } else {
            println("\nmaior: $c")
        }
    }
}
