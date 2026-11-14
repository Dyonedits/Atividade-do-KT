fun main() {
    var numero: Int
    var somaImpares: Int
    print("\nDigite um numero maior que zero: ")
    numero = readln().toInt()
    somaImpares = 0
    for (i in 1..(numero * 2) step 2) {
        somaImpares = somaImpares + i
    }
    println("\n$somaImpares")
}
