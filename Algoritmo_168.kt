fun main() {
    print("\nDIAGONAL PRINCIPAL\n")
    for (linha in 1..10) {
        print("$linha-$linha\n")
        for (tabulacao in 1..linha) {
            print("\t")
        }
    }
    println()
}
