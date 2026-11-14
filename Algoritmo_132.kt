fun main() {
    var reais: Double
    var valorMoeda: Double
    var moeda: String
    print("\nDigite valor em reais a ser convertido: ")
    reais = readln().toDouble()
    print("\nDigite f - franco suico, l - libra esterlina, d - dolar, m - marco alemao: ")
    moeda = readln()
    if (moeda == "f" || moeda == "F") {
        print("\nDigite valor de um franco suico em reais: ")
        valorMoeda = readln().toDouble()
        println("\nTotal de francos suicos: ${reais / valorMoeda}")
    } else {
        if (moeda == "l" || moeda == "L") {
            print("\nDigite valor de uma libra esterlina em reais: ")
            valorMoeda = readln().toDouble()
            println("\nTotal de libras esterlinas: ${reais / valorMoeda}")
        } else {
            if (moeda == "d" || moeda == "D") {
                print("\nDigite valor de um dolar em reais: ")
                valorMoeda = readln().toDouble()
                println("\nTotal de dolares: ${reais / valorMoeda}")
            } else {
                if (moeda == "m" || moeda == "M") {
                    print("\nDigite valor de um marco alemao em reais: ")
                    valorMoeda = readln().toDouble()
                    println("\nTotal de marcos alemaes: ${reais / valorMoeda}")
                } else {
                    println("\nmoeda desconhecida")
                }
            }
        }
    }
}
