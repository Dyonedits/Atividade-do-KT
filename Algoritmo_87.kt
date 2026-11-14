fun main() {
    var resposta: String
    print("\nQual a capital do Brasil? ")
    resposta = readln()
    if (resposta == "BRASÍLIA" || resposta == "Brasília") {
        println("\nPARABÉNS!")
    } else {
        if (resposta == "brasília" || resposta == "BRAZÍLIA" || resposta == "Brazília" || resposta == "brazília") {
            println("\nCERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
        } else {
            println("\nERRADO! ESTUDE MAIS!")
        }
    }
}
