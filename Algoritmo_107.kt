fun main() {
    var nome: String
    print("\nDigite nome: ")
    nome = readln()
    if (nome.take(5) == "JOSÉ " || nome == "JOSÉ") {
        println("\n$nome")
    }
}
