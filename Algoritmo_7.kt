fun perguntar(pergunta: String): Boolean {
    print("$pergunta (s/n): ")
    return readln().trim().lowercase() == "s"
}

fun main() {
    println("ler a prova")
    println("pegar a caneta")
    while (perguntar("Há questão em branco?") && perguntar("O tempo ainda não terminou?")) {
        if (perguntar("Sabe a questão?")) {
            println("resolvê-la")
        } else {
            println("pular para outra")
        }
    }
    println("entregar a prova")
}
