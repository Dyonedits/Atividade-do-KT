fun main() {
    var inicio: Int
    var fim: Int
    var soma: Int
    print("\nDigite valor inicial e valor final de um intervalo, pressionando enter apos digitar cada um: ")
    inicio = readln().toInt()
    fim = readln().toInt()
    soma = 0
    if (inicio % 2 == 0) {
        inicio = inicio + 2
    } else {
        inicio = inicio + 1
    }
    fim--
    for (i in inicio..fim step 2) {
        soma = soma + i
        print("$i  ")
    }
    println("\nsoma $soma")
}
