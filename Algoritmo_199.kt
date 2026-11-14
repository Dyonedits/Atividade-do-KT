fun main() {
    var inicio: Int
    var fim: Int
    print("\nDigite valor inicial e valor final de um intervalo, pressionando enter apos digitar cada um: ")
    inicio = readln().toInt()
    fim = readln().toInt()
    if (inicio % 6 != 0) {
        inicio = inicio + (6 - (inicio % 6))
    }
    for (i in inicio..fim step 6) {
        print("$i ")
    }
    println()
}
