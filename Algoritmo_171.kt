fun main() {
    print("\nDIAGONAL SECUNDARIA\n")
    for (linha in 1..10) {
        for (tabulacao in (10 - linha) downTo 1) {
            print("\t")
        }
        print("$linha-${11 - linha}\n")
    }
    println()
}
