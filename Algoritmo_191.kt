fun main() {
    var limite: Int
    var incremento: Int
    print("\nDigite o numero limite e o incremento pressionando enter apos digitar cada um: ")
    limite = readln().toInt()
    incremento = readln().toInt()
    for (i in 0..limite step incremento) {
        print("$i    ")
    }
    println()
}
