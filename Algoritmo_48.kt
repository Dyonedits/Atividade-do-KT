fun main() {
    var salarioMinimo: Double
    var quantidade: Double
    var preco: Double
    var valorPago: Double
    var valorComDesconto: Double
    print("\nEntre com o salário mínimo: ")
    salarioMinimo = readln().toDouble()
    print("\nEntre com a quantidade em quilowatt: ")
    quantidade = readln().toDouble()
    preco = salarioMinimo / 700
    valorPago = preco * quantidade
    valorComDesconto = valorPago * 0.9
    println("\npreço do quilowatt: $preco")
    println("valor a ser pago: $valorPago")
    println("valor com desconto: $valorComDesconto")
}
