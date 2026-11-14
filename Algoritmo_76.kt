fun main() {
    var numero: Int
    print("\nDigite numero: ")
    numero = readln().toInt()
    println("\nsucessor: ${(numero + 1) % 61}")
}
