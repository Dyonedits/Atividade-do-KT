fun main() {
    var valorCompra: Double
    var valorVenda: Double
    var nomeProduto: String
    print("\nDigite nome do produto: ")
    nomeProduto = readln()
    print("\nDigite valor da compra: ")
    valorCompra = readln().toDouble()
    if (valorCompra < 10.0) {
        valorVenda = valorCompra * 1.7
    } else {
        if (valorCompra < 30.0) {
            valorVenda = valorCompra * 1.5
        } else {
            if (valorCompra < 50.0) {
                valorVenda = valorCompra * 1.4
            } else {
                valorVenda = valorCompra * 1.3
            }
        }
    }
    println("\n$nomeProduto será vendido por R$ ${String.format("%.2f", valorVenda + 0.001)}")
}
