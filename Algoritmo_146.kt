fun main() {
    var percurso: Double
    var consumo: Double
    var tipo: String
    print("\nDigite tipo de carro (A / B / C): ")
    tipo = readln()
    print("\nDigite percurso: ")
    percurso = readln().toDouble()
    if (tipo == "C" || tipo == "c") {
        consumo = percurso / 12
    } else {
        if (tipo == "B" || tipo == "b") {
            consumo = percurso / 9
        } else {
            if (tipo == "A" || tipo == "a") {
                consumo = percurso / 8
            } else {
                consumo = 0.0
            }
        }
    }
    if (consumo != 0.0) {
        println("\nConsumo estimado em litros: ${String.format("%.2f", consumo)}")
    } else {
        println("\nModelo inexistente")
    }
}
