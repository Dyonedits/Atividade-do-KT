fun main() {
    var anoNascimento: Int
    var anoAtual: Int
    print("\nEntre com ano atual: ")
    anoAtual = readln().toInt()
    print("\nEntre com ano de nascimento: ")
    anoNascimento = readln().toInt()
    if (anoNascimento > anoAtual) {
        println("\nAno de Nascimento Invalido")
    } else {
        println("\nidade: ${anoAtual - anoNascimento}")
    }
}
