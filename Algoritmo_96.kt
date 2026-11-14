fun main() {
    var numero: Int
    print("\nDigite numero: ")
    numero = readln().toInt()
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("\ndivisivel por 3 e por 7")
    } else {
        println("\nnao é divisivel por 3 e por 7")
    }
}
