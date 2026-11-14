fun main() {
    var sigla: String
    print("\nDigite sigla: ")
    sigla = readln()
    if (sigla == "RJ" || sigla == "rj") {
        println("\ncarioca")
    } else {
        if (sigla == "SP" || sigla == "sp") {
            println("\npaulista")
        } else {
            if (sigla == "MG" || sigla == "mg") {
                println("\nmineiro")
            } else {
                println("\noutros estados")
            }
        }
    }
}
