fun main() {
    var inicio: Int
    var fim: Int
    print("\nValor inicial e final, pressionando enter apos digitar cada um: ")
    inicio = readln().toInt()
    fim = readln().toInt()
    for (i in inicio..fim) {
        print("$i     ")
    }
    println()
}
