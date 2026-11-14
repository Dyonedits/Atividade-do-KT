fun main() {
    print("\nACIMA DA DIAGONAL SECUNDARIA\n")
    for (linha in 1..9) {
        for (coluna in 1 until (11 - linha)) {
            print("$linha-$coluna\t")
        }
        print("\n")
    }
    println()
}
