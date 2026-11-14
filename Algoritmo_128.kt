fun main() {
    var verbo: String
    var letra: String
    var posicao: Int
    print("\nDigite verbo: ")
    verbo = readln()
    letra = verbo.takeLast(1)
    if ((letra == "R" || letra == "r") && verbo.length >= 2) {
        posicao = verbo.length - 2
        letra = verbo[posicao].toString()
        if (letra == "A" || letra == "a") {
            println("\n1 conjugacao")
        } else {
            if (letra == "E" || letra == "e" || letra == "o" || letra == "O") {
                println("\n2 conjugacao")
            } else {
                if (letra == "I" || letra == "i") {
                    println("\n3 conjugacao")
                } else {
                    println("\nnao existe verbo com terminacao ur")
                }
            }
        }
    } else {
        println("\nnao é um verbo no infinitivo")
    }
}
