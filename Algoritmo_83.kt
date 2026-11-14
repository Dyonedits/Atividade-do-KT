fun main() {
    var numero: Double
    print("Digite numero: ")
    numero = readln().toDouble()
    if (numero > 0.0) {
        println("\ninverso: ${1 / numero}")
    } else {
        println("absoluto: ${numero * -1}")
    }
}
