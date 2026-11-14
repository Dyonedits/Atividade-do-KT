fun main() {
    var palavra: String
    var letra1: String
    var letra2: String
    var letras: String
    var posicao1: Int
    var posicao2: Int
    print("\nDigite uma palavra: ")
    palavra = readln()
    if (palavra.length % 2 == 0) {
        posicao1 = palavra.length / 2
        posicao2 = posicao1 - 1
        letra1 = palavra[posicao1].toString()
        letra2 = palavra[posicao2].toString()
        letras = letra2 + letra1
        if (letras == "rr" || letras == "ss") {
            println("\nÉ rr OU ss")
        } else {
            println("\nNÃO É rr OU ss")
        }
    } else {
        posicao1 = palavra.length / 2
        letra1 = palavra[posicao1].toString()
        if (letra1 == "a" || letra1 == "e" || letra1 == "i" || letra1 == "o" || letra1 == "u") {
            println("\nÉ VOGAL")
        } else {
            println("\nNÃO É VOGAL")
        }
    }
}
