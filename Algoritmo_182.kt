fun main() {
    var numero: Double
    for (contador in 1..10) {
        print("\nDigite numero: ")
        numero = readln().toDouble()
        println("metade: ${numero / 2}")
    }
}
