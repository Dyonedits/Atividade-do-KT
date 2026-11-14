fun main() {
    var quantidade: Int
    var numero: Double
    print("\nQuantos numeros voce quer digitar? ")
    quantidade = readln().toInt()
    for (i in 1..quantidade) {
        print("\nDigite o $i numero de $quantidade: ")
        numero = readln().toDouble()
        println("\n${numero * 3}")
    }
    println()
}
