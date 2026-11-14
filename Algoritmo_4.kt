fun main() {
    println("vejo a previsão do tempo")
    print("Vai fazer sol? (s/n): ")
    val resposta = readln().trim().lowercase()
    if (resposta == "s") {
        println("vou à praia")
    } else {
        println("vou estudar")
    }
    println("almoçar")
    println("ver televisão")
    println("dormir")
}
