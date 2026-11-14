fun main() {
    var numero: Double
    print("\nDigite numero: ")
    numero = readln().toDouble()
    if (numero > 20.0 && numero < 90.0) {
        println("\no número está na faixa de 20 a 90, exclusive")
    } else {
        println("\no número está fora da faixa de 20 a 90")
    }
}
