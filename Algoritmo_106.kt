fun main() {
    var nome: String
    var letra: String
    print("\nDigite nome: ")
    nome = readln()
    letra = nome.take(1)
    if (letra == "A" || letra == "a") {
        println("\n$nome")
    }
}
