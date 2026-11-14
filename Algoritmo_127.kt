fun main() {
    var nota1: Double
    var nota2: Double
    var media: Double
    var nome: String
    print("\nDigite nome: ")
    nome = readln()
    print("\nDigite 1a nota: ")
    nota1 = readln().toDouble()
    print("\nDigite 2a nota: ")
    nota2 = readln().toDouble()
    media = (nota1 + nota2) / 2
    println("\nNome: $nome")
    println("PR1: $nota1")
    println("PR2: $nota2")
    println("Média: $media")
    if (media >= 7.0) {
        println("Aprovado")
    } else {
        if (media < 3.0) {
            println("Reprovado")
        } else {
            println("em Prova Final")
        }
    }
}
