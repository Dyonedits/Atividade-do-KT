fun main() {
    var numero: Int
    var sucessor: Int
    var antecessor: Int
    print("\nEntre com um numero: ")
    numero = readln().toInt()
    antecessor = numero - 1
    sucessor = numero + 1
    println("\no sucessor é $sucessor e o antecessor é $antecessor")
}
