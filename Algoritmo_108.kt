fun main() {
    var nome: String
    var prenome: String
    print("\nDigite nome: ")
    nome = readln()
    prenome = nome.take(5)
    if (prenome == "JOSÉ " || prenome == "José " || prenome == "josé " || nome == "josé" || nome == "José" || nome == "JOSÉ") {
        println("\n$nome")
    }
}
