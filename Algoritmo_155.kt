fun main() {
    var palavra: String
    var novaPalavra: String
    var letra: String
    print("\nDigite palavra: ")
    palavra = readln()
    letra = palavra.take(1)
    if (letra == "l" || letra == "L" || letra == "d" || letra == "D") {
        novaPalavra = palavra.take(2) + palavra.takeLast(1)
    } else {
        novaPalavra = palavra.drop(1)
    }
    println("\npalavra: $novaPalavra")
}
