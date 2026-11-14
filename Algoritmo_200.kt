fun main() {
    var inicio: Int
    var fim: Int
    var numero: Int
    print("\nDigite valor inicial, valor final de um intervalo e o numero de que se procuram os multiplos, pressionando enter apos digitar cada um: ")
    inicio = readln().toInt()
    fim = readln().toInt()
    numero = readln().toInt()
    if (inicio % numero == 0) {
        inicio = inicio + numero
    } else {
        inicio = inicio + (numero - (inicio % numero))
    }
    fim--
    for (i in inicio..fim step numero) {
        print("$i ")
    }
    println()
}
