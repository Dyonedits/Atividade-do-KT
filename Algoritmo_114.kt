fun main() {
    var a: Double
    var b: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    if (a > b) {
        println("\n$a $b")
    } else {
        println("\n$b $a")
    }
}
