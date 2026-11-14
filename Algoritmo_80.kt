fun main() {
    var quantidade: Int
    var valorAluguel: Double
    var faturamentoAnual: Double
    var multas: Double
    var quantidadeFinal: Double
    print("\nDigite a quantidade de fitas: ")
    quantidade = readln().toInt()
    print("\nDigite o valor do aluguel: ")
    valorAluguel = readln().toDouble()
    faturamentoAnual = quantidade / 3.0 * valorAluguel * 12
    println("\nFaturamento anual: $faturamentoAnual")
    multas = valorAluguel * 0.1 * (quantidade / 3.0) / 10
    println("\nMultas mensais: $multas")
    quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0
    println("\nQuantidade de fitas no final do ano: $quantidadeFinal")
}
