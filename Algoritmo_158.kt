fun main() {
    var x: Double
    var fx: Double
    print("\nDigite valor de x: ")
    x = readln().toDouble()
    if (x != 2.0) {
        fx = 8 / (2 - x)
        println("\nf(x) = $fx")
    } else {
        println("\nNAO PODE SER FEITA")
    }
}
