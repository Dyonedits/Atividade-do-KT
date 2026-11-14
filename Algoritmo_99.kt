fun main() {
    var numero: Int
    var centena: Int
    print("\nNumero de 3 algarismos: ")
    numero = readln().toInt()
    centena = numero / 100
    if (centena % 2 == 0) {
        println("\no algarismo das centenas é par: $centena")
    } else {
        println("\no algarismo das centenas é impar: $centena")
    }
}
