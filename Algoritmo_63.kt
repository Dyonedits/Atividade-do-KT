fun main() {
    var aulasDadas: Int
    var valorHoraAula: Double
    var percentualDesconto: Double
    var totalDesconto: Double
    var salarioBruto: Double
    var salarioLiquido: Double
    print("\nHoras trabalhadas: ")
    aulasDadas = readln().toInt()
    print("\nValor da hora-aula: ")
    valorHoraAula = readln().toDouble()
    print("\nPercentual de desconto: ")
    percentualDesconto = readln().toDouble()
    salarioBruto = aulasDadas * valorHoraAula
    totalDesconto = (percentualDesconto / 100) * salarioBruto
    salarioLiquido = salarioBruto - totalDesconto
    println("\nsalário líquido: $salarioLiquido")
}
