fun main() {
    var livro: String
    var tipo: String
    var dias: Int
    print("\nDigite nome do livro: ")
    livro = readln()
    print("\nDigite: professor / aluno: ")
    tipo = readln()
    if (tipo == "professor" || tipo == "Professor" || tipo == "PROFESSOR") {
        dias = 10
    } else {
        if (tipo == "aluno" || tipo == "Aluno" || tipo == "ALUNO") {
            dias = 3
        } else {
            dias = 0
        }
    }
    if (dias == 0) {
        println("\nTipo de usuario desconhecido")
    } else {
        println("\nNome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de Dias: $dias")
    }
}
