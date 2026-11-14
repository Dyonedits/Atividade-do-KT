fun main() {
    var valor: Double
    print("\nDigite valor do produto: ")
    valor = readln().toDouble()
    if (valor < 20.0) {
        println("\nValor de venda: ${valor * 1.45}")
    } else {
        println("\nValor de venda: ${valor * 1.3}")
    }
}
