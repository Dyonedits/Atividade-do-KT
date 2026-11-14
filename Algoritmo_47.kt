fun main() {
    var numero: Int
    var centena: Int
    var dezena: Int
    var unidade: Int
    var numeroInvertido: Int
    print("\nEntre com um número de 3 dígitos: ")
    numero = readln().toInt()
    centena = numero / 100
    dezena = numero % 100 / 10
    unidade = numero % 10
    numeroInvertido = unidade * 100 + dezena * 10 + centena
    println("\nnúmero: $numero")
    println("invertido: $numeroInvertido")
}
