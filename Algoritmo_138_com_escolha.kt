fun main() {
    var numero: Int
    print("\nDigite um numero de 1 - 12: ")
    numero = readln().toInt()
    when (numero) {
        1 -> println("\njaneiro")
        2 -> println("\nfevereiro")
        3 -> println("\nmarço")
        4 -> println("\nabril")
        5 -> println("\nmaio")
        6 -> println("\njunho")
        7 -> println("\njulho")
        8 -> println("\nagosto")
        9 -> println("\nsetembro")
        10 -> println("\noutubro")
        11 -> println("\nnovembro")
        12 -> println("\ndezembro")
        else -> println("\nnao existe mes correspondente a este numero")
    }
}
