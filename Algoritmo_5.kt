fun perguntar(pergunta: String): Boolean {
    print("$pergunta (s/n): ")
    return readln().trim().lowercase() == "s"
}

fun main() {
    println("pegar os ingredientes")
    if (perguntar("A roupa é branca?")) {
        println("colocar avental")
    }
    if (perguntar("Tem batedeira?")) {
        println("bater os ingredientes na batedeira")
    } else {
        println("bater os ingredientes à mão")
    }
    println("colocar a massa na forma")
    println("colocar a forma no forno")
    println("aguardar o tempo necessário")
    println("retirar o bolo")
}
