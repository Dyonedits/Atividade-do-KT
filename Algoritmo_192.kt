fun main() {
    var numero: Int
    var valorFinal: Int
    print("\nDigite um numero: ")
    numero = readln().toInt()
    valorFinal = numero - 1
    for (i in 1..valorFinal step 2) {
        print("$i ")
    }
    println()
}
