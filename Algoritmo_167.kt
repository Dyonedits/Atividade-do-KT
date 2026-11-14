fun main() {
    print("\nACIMA DA DIAGONAL PRINCIPAL\n")
    for (linha in 1..9) {
        for (coluna in (linha + 1)..10) {
            print("\t$linha-$coluna")
        }
        print("\n")
        for (tabulacao in 1..linha) {
            print("\t")
        }
    }
    println()
}
