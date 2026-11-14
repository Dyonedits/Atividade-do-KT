fun main() {
    var numero: Double
    print("\nDigite numero: ")
    numero = readln().toDouble()
    if (numero > 0.0) {
        println("\nPOSITIVO")
    } else {
        if (numero < 0.0) {
            println("\nNEGATIVO")
        } else {
            println("\nNULO")
        }
    }
}
