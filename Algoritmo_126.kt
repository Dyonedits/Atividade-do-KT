fun main() {
    var x: Double
    print("\nDigite valor de X: ")
    x = readln().toDouble()
    if (x == 5.0) {
        println("\nO numero é o 5")
    } else {
        if (x == 200.0) {
            println("\nO numero é o 200")
        } else {
            if (x == 400.0) {
                println("\nO numero é o 400")
            } else {
                if (x >= 500.0 && x <= 1000.0) {
                    println("\nIntervalo 500-1000")
                } else {
                    println("\nFora do escopo")
                }
            }
        }
    }
}
