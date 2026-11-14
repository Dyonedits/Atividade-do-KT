fun main() {
    var numero: Int
    var dezena: Int
    print("Digite numero de tres casas: ")
    numero = readln().toInt()
    dezena = numero % 100 / 10
    println("algarismo da casa das dezenas: $dezena")
}
