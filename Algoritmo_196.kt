fun main() {
    var numero: Int
    var soma: Int
    soma = 0
    print("\nDigite um numero maior que zero: ")
    numero = readln().toInt()
    numero = numero - 1
    for (i in 5..numero step 5) {
        soma = soma + i
    }
    println("\nSoma dos multiplos de 5: $soma")
}
