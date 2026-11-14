fun main() {
    var quantidade: Int
    var numero: Double
    var maior: Double
    print("\nQuantos numeros voce quer digitar? ")
    quantidade = readln().toInt()
    print("\nDigite um numero: ")
    numero = readln().toDouble()
    maior = numero
    for (i in 1..(quantidade - 1)) {
        print("Digite um numero: ")
        numero = readln().toDouble()
        if (numero > maior) {
            maior = numero
        }
    }
    println("\nMaior numero digitado: $maior")
}
