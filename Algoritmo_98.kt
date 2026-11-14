fun main() {
    var salarioBruto: Double
    var valorPrestacao: Double
    print("\nDigite o salario: ")
    salarioBruto = readln().toDouble()
    print("\nDigite o valor da prestacao: ")
    valorPrestacao = readln().toDouble()
    if (valorPrestacao <= 0.3 * salarioBruto) {
        println("\nemprestimo concedido")
    } else {
        println("\nemprestimo negado")
    }
}
