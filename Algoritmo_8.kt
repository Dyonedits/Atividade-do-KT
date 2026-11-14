fun perguntar(pergunta: String): Boolean {
    print("$pergunta (s/n): ")
    return readln().trim().lowercase() == "s"
}

fun main() {
    println("escolher a palavra")
    println("montar o diagrama do jogo")
    while (perguntar("Há lacunas vazias?") && perguntar("O corpo está incompleto?")) {
        if (perguntar("Acertou uma letra?")) {
            println("escrever na lacuna correspondente")
        } else {
            println("desenhar uma parte do corpo na forca")
        }
    }
}
