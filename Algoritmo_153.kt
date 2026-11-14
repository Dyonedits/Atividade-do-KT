fun main() {
    var indice: Double
    print("\nDigite indice de poluicao: ")
    indice = readln().toDouble()
    if (indice >= 0.5) {
        println("\nintimar as industrias dos grupos 1, 2 e 3")
    } else {
        if (indice >= 0.4) {
            println("\nintimar as industrias dos grupos 2 e 3")
        } else {
            if (indice >= 0.3) {
                println("\nintimar as industrias do grupo 3")
            } else {
                println("\nindice de poluicao aceitavel para todos os grupos")
            }
        }
    }
}
