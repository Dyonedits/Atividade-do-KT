fun main() {
    var saldoMedio: Double
    var credito: Double
    print("\nDigite saldo medio: ")
    saldoMedio = readln().toDouble()
    if (saldoMedio < 501.0) {
        credito = 0.0
    } else {
        if (saldoMedio < 1001.0) {
            credito = saldoMedio * 0.3
        } else {
            if (saldoMedio < 3001.0) {
                credito = saldoMedio * 0.4
            } else {
                credito = saldoMedio * 0.5
            }
        }
    }
    if (credito != 0.0) {
        println("\nComo seu saldo era de: $saldoMedio seu credito será de: $credito")
    } else {
        println("\nComo seu saldo era de: $saldoMedio, você não terá nenhum credito")
    }
}
