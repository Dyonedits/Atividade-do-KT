fun main() {
    var multiplicando: Int
    var multiplicador: Int
    var soma: Int
    print("\nEntre com o multiplicando: ")
    multiplicando = readln().toInt()
    print("\nEntre com o multiplicador: ")
    multiplicador = readln().toInt()
    soma = 0
    for (i in 1..multiplicador) {
        soma = soma + multiplicando
    }
    println("\nProduto: $soma")
}
