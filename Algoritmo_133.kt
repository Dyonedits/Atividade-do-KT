fun main() {
    var sexo: String
    var altura: Double
    var peso: Double
    print("\nEntre com a altura: ")
    altura = readln().toDouble()
    print("\nEntre com o sexo M / F: ")
    sexo = readln()
    if (sexo == "M" || sexo == "m") {
        peso = 72.7 * altura - 58
    } else {
        peso = 62.1 * altura - 44.7
    }
    println("\nseu peso ideal: $peso")
}
