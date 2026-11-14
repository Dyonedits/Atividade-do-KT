fun perguntar(pergunta: String): Boolean {
    print("$pergunta (s/n): ")
    return readln().trim().lowercase() == "s"
}

fun main() {
    while (perguntar("Existe um quadrado livre?") && perguntar("Ninguém ganhou o jogo?")) {
        println("espere a jogada do adversário, continue depois")
        if (perguntar("Existe um quadrado livre?")) {
            if (perguntar("O centro está livre?")) {
                println("jogue no centro")
            } else {
                if (perguntar("O adversário tem 2 quadrados em linha com o terceiro desocupado?")) {
                    println("jogue neste quadrado desocupado")
                } else {
                    if (perguntar("Há algum canto livre?")) {
                        println("jogue neste canto")
                    }
                }
            }
        }
    }
}
