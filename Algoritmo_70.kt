fun main() {
    var consumo: Double
    var contaComGorjeta: Double
    print("\nEntre com o valor da conta: ")
    consumo = readln().toDouble()
    contaComGorjeta = consumo * 1.1
    println("\nO valor da conta com a gorjeta será: ${String.format("%.2f", contaComGorjeta)}")
}
