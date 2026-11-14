fun main() {
    print("\nABAIXO DA DIAGONAL PRINCIPAL\n")
    for (linha in 2..10) {
        print("\n")
        for (coluna in 1 until linha) {
            print("$linha-$coluna\t")
        }
    }
    println()
}
