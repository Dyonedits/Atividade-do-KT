fun perguntar(pergunta: String): Boolean {
    print("$pergunta (s/n): ")
    return readln().trim().lowercase() == "s"
}

fun main() {
    if (perguntar("A lâmpada está fora de alcance?")) {
        println("pegar a escada")
    }
    println("pegar a lâmpada")
    if (perguntar("A lâmpada está quente?")) {
        println("pegar pano")
    }
    println("Tirar lâmpada queimada")
    println("Colocar lâmpada boa")
}
