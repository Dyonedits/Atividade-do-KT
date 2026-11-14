fun main() {
    var numero1: Double
    var numero2: Double
    var soma: Double
    print("\nDigite 1 numero: ")
    numero1 = readln().toDouble()
    print("\nDigite 2 numero: ")
    numero2 = readln().toDouble()
    soma = numero1 + numero2
    if (soma > 20.0) {
        println("\nsoma: ${soma + 8}")
    } else {
        println("\nsoma: ${soma - 5}")
    }
}
