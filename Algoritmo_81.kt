fun main() {
    var conta: Int
    var inverso: Int
    var digito: Int
    var d1: Int
    var d2: Int
    var d3: Int
    var soma: Int
    print("\nDigite conta de tres digitos: ")
    conta = readln().toInt()
    d1 = conta / 100
    d2 = conta % 100 / 10
    d3 = conta % 100 % 10
    inverso = d3 * 100 + d2 * 10 + d1
    soma = conta + inverso
    d1 = (soma / 100) * 1
    d2 = (soma % 100 / 10) * 2
    d3 = (soma % 100 % 10) * 3
    digito = (d1 + d2 + d3) % 10
    println("\ndigito verificador: $digito")
}
