fun main() {
    var opcao: Int
    var pesoTerra: Double
    println("planetas que podem ser analisados: ")
    println("1 mercurio")
    println("2 venus")
    println("3 marte")
    println("4 jupiter")
    println("5 saturno")
    println("6 urano")
    print("escolha o planeta a ser analisado: ")
    opcao = readln().toInt()
    print("entre com um peso na terra: ")
    pesoTerra = readln().toDouble()
    when (opcao) {
        1 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 0.37}")
        2 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 0.88}")
        3 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 0.38}")
        4 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 2.64}")
        5 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 1.15}")
        6 -> println("seu peso no planeta é: ${(pesoTerra / 10) * 1.17}")
        else -> println("este planeta não pode ser analisado")
    }
}
