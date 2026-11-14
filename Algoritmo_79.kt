import kotlin.math.pow

fun main() {
    var valorAcumulado: Double
    var taxa: Double
    var aplicacao: Double
    var meses: Int
    print("\nDigite o valor da aplicação: ")
    aplicacao = readln().toDouble()
    print("\nDigite a taxa (0 - 1): ")
    taxa = readln().toDouble()
    print("\nDigite o numero de meses: ")
    meses = readln().toInt()
    valorAcumulado = aplicacao * ((1 + taxa).pow(meses) - 1) / taxa
    println("\nO valor acumulado: $valorAcumulado")
}
