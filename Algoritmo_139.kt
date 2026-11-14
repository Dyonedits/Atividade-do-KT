fun main() {
    var eleitoresAptos: Int
    var votos: Int
    var nome: String
    print("\nDigite nome do Municipio: ")
    nome = readln()
    print("\nNumero de eleitores aptos: ")
    eleitoresAptos = readln().toInt()
    print("\nNumero de votos do candidato mais votado: ")
    votos = readln().toInt()
    if (eleitoresAptos > 20000 && votos <= eleitoresAptos / 2) {
        println("\n$nome tera segundo turno")
    } else {
        println("\n$nome nao terá segundo turno")
    }
}
