fun main() {
    var preco: Double
    var novoPreco: Double
    print("\nDigite valor do produto: ")
    preco = readln().toDouble()
    novoPreco = preco * 0.91
    println("\npreço com desconto: $novoPreco")
}
