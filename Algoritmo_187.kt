fun main() {
    var base: Int
    var expoente: Int
    var potencia: Int
    print("\nDigite a base inteira e maior do que 1: ")
    base = readln().toInt()
    print("\nDigite expoente inteiro maior que 1: ")
    expoente = readln().toInt()
    if (base >= 2 && expoente > 1) {
        potencia = 1
        for (i in 1..expoente) {
            potencia = potencia * base
        }
        println("\npotencia: $potencia")
    } else {
        println("\nNao satisfazem")
    }
}
