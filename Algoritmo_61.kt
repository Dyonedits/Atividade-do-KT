fun main() {
    var quinto: Int
    var razao: Int
    var termo: Int
    print("\nEntre com o 1 termo: ")
    termo = readln().toInt()
    print("\nEntre com a razao: ")
    razao = readln().toInt()
    quinto = termo * razao * razao * razao * razao
    println("\nO 5 termo desta P.G. é: $quinto")
}
