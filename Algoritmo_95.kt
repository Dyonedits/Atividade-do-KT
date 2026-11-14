fun main() {
    var numero: Int
    print("\nDigite numero: ")
    numero = readln().toInt()
    if (numero % 5 == 0) {
        println("\né divisivel por 5")
    } else {
        println("\nnao é divisivel por 5")
    }
}
