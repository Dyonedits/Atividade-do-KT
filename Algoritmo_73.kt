fun main() {
    var numero: Double
    var parteFracionaria: Double
    var parteInteira: Int
    var arredondado: Int
    print("\nEntre com um numero com parte fracionária: ")
    numero = readln().toDouble()
    parteInteira = Math.round(numero - 0.5).toInt()
    parteFracionaria = numero - parteInteira
    arredondado = Math.round(numero + 0.00001).toInt()
    println("\nparte inteira: $parteInteira")
    println("parte fracionária: ${String.format("%.3f", parteFracionaria + 0.00001)}")
    println("numero arredondado: $arredondado")
}
