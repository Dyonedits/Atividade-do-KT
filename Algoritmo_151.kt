import kotlin.math.pow

fun main() {
    var nome: String
    var peso: Double
    var altura: Double
    var imc: Double
    print("\nDigite nome do paciente: ")
    nome = readln()
    print("\nDigite peso: ")
    peso = readln().toDouble()
    print("\nDigite altura: ")
    altura = readln().toDouble()
    imc = peso / altura.pow(2)
    if (imc < 20.0) {
        println("\n$nome: abaixo do peso")
    } else {
        if (imc <= 25.0) {
            println("\n$nome: normal")
        } else {
            if (imc <= 30.0) {
                println("\n$nome: excesso de peso")
            } else {
                if (imc <= 35.0) {
                    println("\n$nome: obesidade")
                } else {
                    println("\n$nome: obesidade mórbida")
                }
            }
        }
    }
}
