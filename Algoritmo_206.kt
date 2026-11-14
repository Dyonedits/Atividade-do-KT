fun main() {
    var quantidade: Int
    var numero: Double
    var maior: Double
    var menor: Double
    print("Quantos numeros voce quer digitar? ")
    quantidade = readln().toInt()
    print("\nEntre com um numero: ")
    numero = readln().toDouble()
    maior = numero
    menor = numero
    for (i in 1 until quantidade) {
        print("\nEntre com um numero: ")
        numero = readln().toDouble()
        if (numero > maior) {
            maior = numero
        } else {
            if (numero < menor) {
                menor = numero
            }
        }
    }
    println("\nMaior: $maior")
    println("Menor: $menor")
}
