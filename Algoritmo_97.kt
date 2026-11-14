fun main() {
    var numero: Int
    print("\nDigite numero: ")
    numero = readln().toInt()
    if (numero % 10 == 0) {
        println("\nmúltiplo de 10")
    } else {
        if (numero % 2 == 0) {
            println("\nmúltiplo de 2")
        } else {
            if (numero % 5 == 0) {
                println("\nmúltiplo de 5")
            } else {
                println("\nnão é múltiplo de 2 nem de 5")
            }
        }
    }
}
