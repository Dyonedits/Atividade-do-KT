fun main() {
    var nome: String
    var letra: Char
    print("\nDigite nome: ")
    nome = readln()
    letra = nome.first()
    if ((letra >= 'A' && letra <= 'K') || (letra >= 'a' && letra <= 'k')) {
        println("\n$nome sala: 101 (bloco F)")
    } else {
        if ((letra >= 'L' && letra <= 'N') || (letra >= 'l' && letra <= 'n')) {
            println("\n$nome sala: 102 (bloco F)")
        } else {
            if ((letra >= 'O' && letra <= 'Z') || (letra >= 'o' && letra <= 'z')) {
                println("\n$nome sala: 103 (bloco F)")
            } else {
                println("\nNOME INVALIDO")
            }
        }
    }
}
