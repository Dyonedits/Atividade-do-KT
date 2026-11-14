fun main() {
    var decimo: Int
    var razao: Int
    var termo: Int
    print("\nEntrar com o 1 termo: ")
    termo = readln().toInt()
    print("\nEntrar com a razao: ")
    razao = readln().toInt()
    decimo = termo + 9 * razao
    println("\nO 10 termo desta P.A. é: $decimo")
}
