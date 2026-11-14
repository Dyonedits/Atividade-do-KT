fun main() {
    var deposito: Double
    var taxa: Double
    var rendimento: Double
    var total: Double
    print("\nEntre com depósito: ")
    deposito = readln().toDouble()
    print("\nEntre com a taxa de juros: ")
    taxa = readln().toDouble()
    rendimento = deposito * taxa / 100
    total = deposito + rendimento
    println("\nRendimentos: $rendimento")
    println("Total: $total")
}
