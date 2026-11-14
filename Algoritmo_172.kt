fun main() {
    print("\nABAIXO DA DIAGONAL SECUNDARIA\n")
    print("\n")
    for (linha in 2..10) {
        for (tabulacao in (11 - linha) downTo 1) {
            print("\t")
        }
        for (coluna in (12 - linha)..10) {
            print("$linha-$coluna\t")
        }
        print("\n")
    }
    println()
}
