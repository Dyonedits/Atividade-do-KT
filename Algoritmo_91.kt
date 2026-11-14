fun main() {
    var numero1: Int
    var numero2: Int
    var soma: Int
    print("\n\nDigite 1 numero: ")
    numero1 = readln().toInt()
    print("\n\nDigite 2 numero: ")
    numero2 = readln().toInt()
    soma = numero1 + numero2
    if (soma > 10) {
        println("\nsoma: $soma")
    }
}
