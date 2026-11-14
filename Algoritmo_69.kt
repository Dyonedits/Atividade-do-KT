fun main() {
    var numerador: Int
    var denominador: Int
    print("\nDigite numerador: ")
    numerador = readln().toInt()
    print("\nDigite denominador: ")
    denominador = readln().toInt()
    println("\ndecimal: ${numerador.toDouble() / denominador}")
}
