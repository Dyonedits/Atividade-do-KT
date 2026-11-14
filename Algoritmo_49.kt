fun main() {
    var nome: String
    print("\nEntre com nome: ")
    nome = readln()
    println("\ntodo nome: $nome")
    println("primeiro caractere: ${nome.first()}")
    println("ultimo caractere: ${nome.last()}")
    println("primeiro ao terceiro caractere: ${nome.take(3)}")
    println("quarto caractere: ${nome[3]}")
    println("todos menos o primeiro: ${nome.drop(1)}")
    println("os dois ultimos: ${nome.takeLast(2)}")
}
