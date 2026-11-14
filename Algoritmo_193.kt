fun main() {
    var numero: Int
    var valorFinal: Int
    print("\nDigite um numero: ")
    numero = readln().toInt()
    valorFinal = numero * 2
    for (i in 2..valorFinal step 2) {
        print("$i ")
    }
    println()
}
