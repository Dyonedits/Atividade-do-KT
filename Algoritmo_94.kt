fun main() {
    var numero: Int
    print("\nDigite numero: ")
    numero = readln().toInt()
    if (numero % 3 == 0) {
        println("\nmultiplo de 3")
    } else {
        println("\nnao é multiplo de 3")
    }
}
