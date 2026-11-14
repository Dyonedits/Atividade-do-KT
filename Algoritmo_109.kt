fun main() {
    var nome1: String
    var nome2: String
    print("\nDigite 1 nome: ")
    nome1 = readln()
    print("\nDigite 2 nome: ")
    nome2 = readln()
    if (nome1 < nome2) {
        println("\n$nome1 $nome2")
    } else {
        println("\n$nome2 $nome1")
    }
}
