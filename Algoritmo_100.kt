fun main() {
    var numero: Int
    var formado: Int
    print("\nNumero de 4 algarismos: ")
    numero = readln().toInt()
    formado = numero / 100
    if (formado % 4 == 0) {
        println("\no numero é multiplo de 4: $formado")
    } else {
        println("\no numero nao é multiplo de 4: $formado")
    }
}
