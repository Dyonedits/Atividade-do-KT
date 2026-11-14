fun main() {
    var quantidade: Int
    var numero: Double
    var maior: Double
    print("\nQuantos numeros voce quer digitar? ")
    quantidade = readln().toInt()
    maior = -1.0
    for (i in 1..quantidade) {
        print("\nDigite um numero: ")
        numero = readln().toDouble()
        if (numero > maior) {
            maior = numero
        }
    }
    println("\nEste é o maior numero que voce digitou: $maior")
}
