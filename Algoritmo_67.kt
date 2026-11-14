fun main() {
    var prestacao: Double
    var valor: Double
    var taxa: Double
    var tempo: Int
    print("\nDigite o valor da prestação: ")
    valor = readln().toDouble()
    print("\nDigite a taxa: ")
    taxa = readln().toDouble()
    print("\nDigite o tempo (número de meses): ")
    tempo = readln().toInt()
    prestacao = valor + (valor * (taxa / 100) * tempo)
    println("\no valor da prestação em atraso é = $prestacao")
}
