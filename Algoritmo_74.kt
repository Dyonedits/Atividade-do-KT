fun main() {
    var salarioMinimo: Double
    var salarioPessoa: Double
    var quantidade: Double
    print("\nEntre com o salário mínimo: ")
    salarioMinimo = readln().toDouble()
    print("\nEntre com o salário da pessoa: ")
    salarioPessoa = readln().toDouble()
    quantidade = salarioPessoa / salarioMinimo
    println("\na pessoa ganha $quantidade salários mínimos")
}
