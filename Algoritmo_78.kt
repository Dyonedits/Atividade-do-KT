fun main() {
    var numeroDiagonais: Double
    var lados: Int
    print("\nDigite o numero de lados do polígono: ")
    lados = readln().toInt()
    numeroDiagonais = lados * (lados - 3) / 2.0
    println("\nnumero de diagonais: $numeroDiagonais")
}
